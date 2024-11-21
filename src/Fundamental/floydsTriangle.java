package Fundamental;

public class floydsTriangle {
    public static void main(String[] args) {
        floyid(5);
    }
    public static void floyid(int n){
        int counter =1;
        for (int i =1;i<=n;i++){
            for (int j =0;j<i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
}
