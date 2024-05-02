package Sorting;

public class CountSort {
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,1,5,9};
        countSort(arr);
        PrintArr(arr);
    }
    public static void PrintArr(int arr[]){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countSort(int arr[]){

        int n = arr.length;

        int largest = Integer.MIN_VALUE;
        for(int i = 0 ;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];
        for(int i =0 ; i<n;i++){
            count[arr[i]]++;
        }

        int j =0;
        for (int i =0 ;i<count.length;i++){
            while (count[i]>0){
                arr[i] = j;
                j++;
                count[i]--;
            }
        }
    }

}