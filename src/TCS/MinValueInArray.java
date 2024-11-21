package TCS;

public class MinValueInArray {
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};

        int min = Integer.MAX_VALUE;
        for(int a : arr){
            min = Math.min(min,a);
        }
        System.out.println(min);
    }



}
