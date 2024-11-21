package Recursion;

public class TilesPr {
    public static void main(String[] args) {
        System.out.println(tiling(4));
    }

    public static int tiling(int n){

        if(n == 0 || n ==1){
            return 1;
        }

        //vertical
        int Vnm1= tiling(n-1);

        // Horizontal
        int Hnm1 = tiling(n-2);

        //total ways
        int total = Vnm1 + Hnm1;
        return total;
    }
}
