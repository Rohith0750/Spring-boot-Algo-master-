public class Recurssion {

    public static void printdecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printdecreasing(n-1);

    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*factorial(n-1);
        return fn;
    }
    public static int sumofnumbers(int n){
        if(n==1){
            return 1;
        }
        int snm1=sumofnumbers(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void printincreasing(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n + " ");

    }

    public static void main(String []a){
        int n = 10;
        printdecreasing(n);
        printincreasing(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumofnumbers(10));
    }

}
