package BitManupulation;

public class updateithBit extends ClearithBit {
    public static void main(String[] args) {
        System.out.println(update(10,2,1));
    }

    public static int update(int n,int i,int newBit){

       Clear(n,i);
       int bitMask = newBit<<i;
       return n|bitMask;


    }


}
