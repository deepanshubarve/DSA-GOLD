package BitManupulation;

public class CheckithBit {
    public static void main(String[] args) {
        System.out.println(CheckBit(10,2));
    }
    public static int CheckBit(int n ,int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
}

