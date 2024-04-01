public class PrimesInrange {
    public static void main(String[] args) {
      inRange(20);
    }

    public static void inRange(int n){

        for(int i = 2;i<=n;i++){
            if(PrimeOrNot.isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


}
