package Greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumABsDiff {
    public static void main(String[] args) {

        int [] A = {1,2,3};
        int [] B = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int absDiff = 0;
        for (int i =0;i<A.length;i++){
            absDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println(absDiff);
    }
}
