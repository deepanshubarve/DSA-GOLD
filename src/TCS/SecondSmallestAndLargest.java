package TCS;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        int secondSmallest = SecondSmallest(arr);
        System.out.println(secondSmallest);
        int secondLargest = Secondlargest(arr);
        System.out.println(secondLargest);
    }

    public static int SecondSmallest(int arr[]){

        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }else if(arr[i] < second_small && arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }

    public static int Secondlargest(int arr[]){

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
}
