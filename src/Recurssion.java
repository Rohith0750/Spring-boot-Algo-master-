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
    public static int fibanocci(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1 =fibanocci(n-1);
        int fnm2=fibanocci(n-2);
        int fn =fnm1+fnm2;
        return fn;
    }
    public static boolean issorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        issorted( arr,i+1);
        return true;
    }

    public static void main(String []a){
        int n = 10;
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
        printdecreasing(n);
        printincreasing(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println(sumofnumbers(10));
        System.out.println(fibanocci(25));

    }

}
