public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println(isPrime(89));
    }
    public static boolean isPrime(int n){
        //corner case
        if(n ==  2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
           if( n%i ==0){
                return false;
           }
        }
        return true;
    }
}
