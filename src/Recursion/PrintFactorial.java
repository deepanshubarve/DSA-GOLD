package Recursion;

public class PrintFactorial {
    public static void main(String[] args) {
        System.out.println(fact(10));
    }

    public static int fact(int n){

        if(n == 0){
            return 1;
        }
        //int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
        return fn;
    }
}
