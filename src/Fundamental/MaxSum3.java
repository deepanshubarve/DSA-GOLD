public class MaxSum3 {
    public static void main(String[] args) {
        int numbers[] ={-2,-3,-1,4,-5};
        kadaneAlgo(numbers);
    }

    public static void kadaneAlgo(int numbers[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i<numbers.length;i++) {
            currentSum = currentSum + numbers[i];
            if (currentSum < 0) {
                currentSum = 0;
            }
            maxSum = Math.max(maxSum,currentSum);

        }
        System.out.println("The maximum sum of subarray is " + maxSum);

    }
}
