package Recursion;

public class PowerFunction {
    public static void main(String[] args) {
        System.out.println(OptimizedPower(2,10));
    }
    public static int pf(int x, int n){
        if(n == 0){
            return 1;
        }
        return x*pf(x,n-1);
    }

    public static int OptimizedPower(int x,int n){

        if(n == 0){
            return 1;
        }

        int halfPower = OptimizedPower(x,n/2);
        int halfPowerSquare = halfPower * halfPower;

        if(n% 2!= 0){
            halfPowerSquare = x * halfPowerSquare;
        }

        return halfPowerSquare;

    }

}
