package BitManupulation;

public class CheckOddAndEven {
    public static void main(String[] args) {
         OddEven(23);
         OddEven(6);
         OddEven(15);
    }
    public static void OddEven(int n ){
        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("it is even ");
        }else{
            System.out.println("it is odd");
        }
    }
}
