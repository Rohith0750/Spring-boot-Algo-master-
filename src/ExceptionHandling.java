import java.util.Scanner;
//
//public class ExceptionHandling {
//    public static void main(String[] args) {
//    try{
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int res = a/b;
//        System.out.println(res);
//    } catch (Exception e) {
//        System.out.println("dont put b as a 0");
//    }
//
//
//
//    }
//}

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling {

    // ===============================
    // METHOD WITH CHECKED EXCEPTION
    // ===============================
    // Checked exception must be handled or declared using throws
    public static void readFile() throws IOException {
        System.out.println("\nInside readFile() method");

        File file = new File("test.txt");  // file may not exist
        FileReader fr = new FileReader(file);  // Checked Exception

        System.out.println("File opened successfully");
        fr.close();
    }


    // ===============================
    // METHOD WITH UNCHECKED EXCEPTION
    // ===============================
    // Unchecked exception occurs at runtime
    public static void divideNumber(int a, int b) {

        System.out.println("\nInside divideNumber() method");

        int result = a / b;  // ArithmeticException if b = 0

        System.out.println("Result = " + result);
    }


    // ===============================
    // METHOD USING THROW KEYWORD
    // ===============================
    public static void checkAge(int age) {

        System.out.println("\nInside checkAge() method");

        if(age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("You are eligible");
    }


    // ===============================
    // MAIN METHOD
    // ===============================
    public static void main(String[] args) {

        // Checked Exception Handling
        try {
            readFile();
        }
        catch(IOException e) {
            System.out.println("Checked Exception handled: " + e);
        }


        // Unchecked Exception Handling
        try {
            divideNumber(10, 0);
        }
        catch(ArithmeticException e) {
            System.out.println("Unchecked Exception handled: " + e);
        }


        // Throw example handling
        try {
            checkAge(15);
        }
        catch(ArithmeticException e) {
            System.out.println("Custom Exception handled: " + e.getMessage());
        }


        // Finally block
        finally {
            System.out.println("\nFinally block always executes");
        }

        System.out.println("\nProgram continues normally...");
    }
}

