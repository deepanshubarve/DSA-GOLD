package Fundamental;

public class ButterFly {
    public static void main(String[] args) {
        butFly(4);
    }

    public static void butFly(int n){
        for(int i = 1;i<=n;i++){

            //print star
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            //print space
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = n;i>=1;i--){

            for (int j =1;j<=i;j++){
                System.out.print("*");
            }

            //print space
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
