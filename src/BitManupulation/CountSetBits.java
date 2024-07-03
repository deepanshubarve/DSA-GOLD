package BitManupulation;

public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(SetBits(15));
    }
    public static int SetBits(int n ){
        int count = 0;
        while (n>0){
            if( (n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
}
