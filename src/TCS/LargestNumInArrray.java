package TCS;

public class LargestNumInArrray {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};

        int max = Integer.MIN_VALUE;
        for(int a : arr){
            max = Math.max(max,a);
        }
        System.out.println(max);
    }
}
