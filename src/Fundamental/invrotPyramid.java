package Fundamental;

public class invrotPyramid {
    public static void main(String[] args) {
IRP(5);
    }

    public static void IRP(int totalrow){
        for(int i =1 ;i<=totalrow;i++){
            for(int j =1;j<=totalrow-i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
