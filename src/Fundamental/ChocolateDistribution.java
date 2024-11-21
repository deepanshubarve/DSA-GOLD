package Fundamental;

import java.util.Arrays;

public class ChocolateDistribution {
    public static void main(String[] args) {

        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        System.out.println(distribution(arr,7));
    }

    public static int distribution(int arr[],int m){
         int n = arr.length;
         if( n == 0 || m==0){
            return 0;
        }
        Arrays.sort(arr);

         if(n -1 < m)
             return -1;

         int min_difference = Integer.MAX_VALUE;

        for(int i = 0; i< n ;i++){
           int nextwindow = i + m -1;
           if(nextwindow > n)
               break;

           int diff = arr[nextwindow-1] - arr[i];

           min_difference = Math.min(min_difference,diff);
        }
        return min_difference;
    }
}
