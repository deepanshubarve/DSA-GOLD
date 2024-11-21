package Fundamental;

public class CharPattern {
    public static void main(String[] args) {
        int ch = 'A';
        for(int i =1;i<=4;i++){
            for(int j = 1;j<=i;j++ ){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
