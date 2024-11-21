package Fundamental;

public class DiamondPattern {
    public static void main(String[] args) {
DP(4);
    }

    public static void DP(int n ){
        for(int i =1;i<=n;i++){

            //space
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j =1;j<=(2*i-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i =n;i>=1;i--){

            //space
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j =1;j<=(2*i-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
