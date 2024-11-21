package Recursion;

public class friendsPairing {
    public static void main(String[] args) {
        System.out.println(pf(3));
    }

    public static int pf(int n ){
        if(n == 0 || n == 1){
            return n;
        }
        //single
        int fnm1 = pf(n-1);

        //pair
        int fnm2 = pf(n-2);
        int pairs = (n-1 * fnm2);

        int totalWays = fnm1 + pairs;

        return totalWays;

        //one liner
        //return pf(n-1) * (n-1)*pf(n-2);
    }


}
