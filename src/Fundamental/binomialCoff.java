package Fundamental;

public class binomialCoff {
    public static void main(String[] args) {
        System.out.println(cofficient(5,2));

    }

    public static int cofficient(int n,int r){
        int a = factorial(n);
        int b=factorial(r);
       int c = factorial(n-r);

       int coff = a/(b*c);
       return coff;
    }

    public static int factorial(int n){
        int f =1;

        for (int i = 1;i<=n;i++){
            f= f*i;
        }
        return f;
    }

}
