package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,3};
        BSort(arr);
        PrintArr(arr);
    }

    public static void PrintArr(int arr[]){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void BSort(int arr[]){
        int n = arr.length;

        for(int turn =0;turn<n;turn++){

            for(int j =0 ;j<n-1-turn;j++){

                if(arr[j]>arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }

        }

    }
}
