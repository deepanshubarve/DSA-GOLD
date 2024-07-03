package BitManupulation;

public class ClearithBit {
    public static void main(String[] args) {
        System.out.println(Clear(10,1));
    }
    public static int Clear(int n , int i){

        int bitMask = ~(i<<1);
        return n & bitMask;
    }
}
