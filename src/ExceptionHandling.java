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

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println(100/0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Invalid input");
        }
    }
}
