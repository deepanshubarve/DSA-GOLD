public class SolidRhombus {
    public static void main(String[] args) {

        SR(5);
    }

    public static void SR(int n){
        for(int i =1;i<=n;i++){

            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
