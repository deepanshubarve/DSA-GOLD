package BitManupulation;

public class FastExo {
    public static void main(String[] args) {

        System.out.println(Fast(2,2));
    }
//    public static int Fast(int a , int n){
//        int ans =1 ;
//
//        while (n>0){
//            if( (n & 1) != 0){
//                ans = ans * a;
//            }
//            a = a*a ;
//            n = n >> 1;
//        }
//        return ans;
//    }

    public static long Fast(long a , long b){
        if(b == 0){
            return 1;
        }

        long half = Fast(a,b/2);
        long result = half * half;
        if( b  % 2 == 1){
            result = a*result;
        }
        return result;
    }
}
