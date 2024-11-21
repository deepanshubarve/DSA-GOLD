package Recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    public static int sum (int n){

        if(n == 1){
            return 1;
        }
        int Fnm1 = sum(n-1);
        int fn = n+Fnm1;
        return fn;
    }
}
