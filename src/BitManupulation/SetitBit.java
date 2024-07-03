package BitManupulation;

public class SetitBit {
    public static void main(String[] args) {


        System.out.println(SetBIt(10,3));
    }

    public static int SetBIt(int n,int i ){
        int bitMask = i<<1;

        return n|bitMask;
    }
}
