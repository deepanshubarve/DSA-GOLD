package Fundamental;

public class decToBin {
    public static void main(String[] args) {
DTB(7);
    }
    public static void DTB(int decNum){
        int pow=0;
        int myNum= decNum;
        int binNum = 0;

        while (decNum>0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum =decNum/2;
        }
        System.out.println("the converted decimal to binary is " + myNum+ " = " + binNum);


    }
}
