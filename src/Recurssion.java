public class Recurssion {

    public static void printdecreasing(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printdecreasing(n-1);
    }

    public static void main(String []a){
        int n = 10;
        printdecreasing(n);
    }
}
