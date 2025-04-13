package TCS;

public class SumOfNumber {
    public static void main(String[] args) {

        String str = "1xyz23";
        String tempSum = "0";
        int sum = 0;

        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                tempSum += ch;
            }else{
                sum += Integer.parseInt(tempSum);
                tempSum = "0";
            }
        }
        System.out.println(sum + Integer.parseInt(tempSum));
    }
}
