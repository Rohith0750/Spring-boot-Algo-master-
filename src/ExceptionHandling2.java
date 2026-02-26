import java.util.*;

class invalidcustomerexception extends RuntimeException{  //unchecked excepttion , if i give excpeion checked or uncheked
    public invalidcustomerexception(String msg){
        super("Invalid customer");
    }
}

class Atm{
    private int accountno =4545;
    private int password =1234;
    int acc;
    int pass;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the acc number");
        acc=sc.nextInt();
        System.out.println("Kindly enter the pass number");
        pass=sc.nextInt();
    }

    public void verify() {
        if(accountno==acc && password==pass){
            System.out.println("You have successfully verified");
        }else{
            System.out.println("You have not successfully verified");
//            input();
//            verify();

            invalidcustomerexception in = new invalidcustomerexception("Invalid cred!");
            System.out.println(in.getMessage());
            throw in;
            //throw new invalidcustomerexception();

        }
    }
}

class bank{
     public void initiate(){

         try{
        Atm atm=new Atm();
        atm.input();
        atm.verify();
     }catch(invalidcustomerexception in){
             try{
                 Atm atm=new Atm();
                 atm.input();
                 atm.verify();
             }catch(invalidcustomerexception in2){
                 try{
                     Atm atm=new Atm();
                     atm.input();
                     atm.verify();
                 }catch(invalidcustomerexception in3){
                     System.out.println("You have not successfully verified , No chances ");
                 }
             }
         }
     }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        bank bank=new bank();
        bank.initiate();
    }
}


/*

import java.util.*;
class Atm{
    private int accountno =4545;
    private int password =1234;
    int acc;
    int pass;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the acc number");
        acc=sc.nextInt();
        System.out.println("Kindly enter the pass number");
        pass=sc.nextInt();
    }

    public void verify(){
        if(accountno==acc && password==pass){
            System.out.println("You have successfully verified");
        }else{
            System.out.println("You have not successfully verified");
            input();
            verify();
        }
    }
}

class bank{
     public void initiate(){
        Atm atm=new Atm();
        atm.input();
        atm.verify();
     }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        bank bank=new bank();
        bank.initiate();
    }
}

 */

/*
import java.util.*;

class invalidcustomerexception extends RuntimeException{  //unchecked excepttion , if i give excpeion checked or uncheked

}

class Atm{
    private int accountno =4545;
    private int password =1234;
    int acc;
    int pass;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the acc number");
        acc=sc.nextInt();
        System.out.println("Kindly enter the pass number");
        pass=sc.nextInt();
    }

    public void verify() {
        if(accountno==acc && password==pass){
            System.out.println("You have successfully verified");
        }else{
            System.out.println("You have not successfully verified");
//            input();
//            verify();

//            invalidcustomerexception in = new invalidcustomerexception();
//            throw in;
            throw new invalidcustomerexception();

        }
    }
}

class bank{
     public void initiate(){

         try{
        Atm atm=new Atm();
        atm.input();
        atm.verify();
     }catch(invalidcustomerexception in){
             try{
                 Atm atm=new Atm();
                 atm.input();
                 atm.verify();
             }catch(invalidcustomerexception in2){
                 try{
                     Atm atm=new Atm();
                     atm.input();
                     atm.verify();
                 }catch(invalidcustomerexception in3){
                     System.out.println("You have not successfully verified , No chances ");
                 }
             }
         }
     }
}

public class ExceptionHandling2 {
    public static void main(String[] args) {
        bank bank=new bank();
        bank.initiate();
    }
}
output
"C:\Program Files\Java\jdk-24\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\lib\idea_rt.jar=61429" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\Rohith S D\IdeaProjects\Spring Boot Algo Course\out\production\Spring Boot Algo Course" ExceptionHandling2
Kindly enter the acc number
2332
Kindly enter the pass number
23233
You have not successfully verified
Kindly enter the acc number
233223
Kindly enter the pass number
23232
You have not successfully verified
Kindly enter the acc number
3223
Kindly enter the pass number
2332
You have not successfully verified
You have not successfully verified , No chances

Process finished with exit code 0

 */