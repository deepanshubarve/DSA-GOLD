package Fundamental;

public class binToDecimal {
    public static void main(String[] args) {
      BTD(1110);
    }

    public static void BTD(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec =0;

        while (binNum>0){
            int LastDigit = binNum % 10;
            dec = dec +(LastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the converted binary to decimal is " + myNum+ " = " + dec);
    }
}
