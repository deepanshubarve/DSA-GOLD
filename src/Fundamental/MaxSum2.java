package Fundamental;

public class MaxSum2 {
    public static void main(String[] args) {
        int numbers[] = { 1,-2,6,-1,3};
        prefixSum(numbers);
    }

    public static void prefixSum(int numbers[]) {
       int currSum = 0;
       int max = Integer.MIN_VALUE;
        int prefixsum[] = new int[numbers.length];

        prefixsum[0] = numbers[0];

        for( int i =1;i<numbers.length;i++){
            prefixsum[i] = prefixsum[i-1] + numbers[i];
        }

        for(int i = 0;i<numbers.length;i++){
            int start =i;

            for(int j =i;j<numbers.length;j++){
                int end = j;


                currSum = start==0?prefixsum[end] :  prefixsum[end] - prefixsum[start-1];

                if(max<currSum){
                    max = currSum;
                }
            }
        }
        System.out.println("The max sum of the subarray " + max);

    }
}
