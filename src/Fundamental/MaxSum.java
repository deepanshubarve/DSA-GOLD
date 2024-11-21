package Fundamental;

public class MaxSum {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,10};
        maxSubArraySum(arr);
    }

    public static void maxSubArraySum(int arr[]){

        int current =0;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                current=0;
                for(int k = i;k<=j;k++){
                    current+=arr[k];
                }

                System.out.println(current);
                if(max<current)
                    max = current;
            }
        }
        System.out.println("The maximum sum of subarray "+ max);
    }
}
