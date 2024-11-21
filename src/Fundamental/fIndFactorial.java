package Fundamental;

public class fIndFactorial {
    public static void main(String[] args) {

        int fc = factorial(30);
        System.out.println(fc);


    }
    public static int factorial ( int n){
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
