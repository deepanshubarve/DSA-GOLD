package Recursion;

public class PrintFibonacci {
    public static void main(String[] args) {

        System.out.println(fibu(80));
    }

    public static int fibu(int n){

        if (n == 0 || n==1){
            return n;
        }
        int fnm1 = fibu(n-1);
        int fnm2 =  fibu(n-2);
         int fin = fnm1 + fnm2;
         return fin;
    }
}
