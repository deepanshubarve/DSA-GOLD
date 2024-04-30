package Sorting;

public class selectionSort {
    public static void main(String[] args) {


        int arr[] = {1,5,3,2,6};
       SelectionS(arr);
        PrintArr(arr);
    }

    public static void SelectionS(int arr[]){
        for(int i =0 ;i< arr.length-1;i++){
            int MinValue = i;

            for(int j =i+1;j< arr.length;j++){
                if(arr[MinValue]>arr[j]){
                    MinValue=j;
                }
            }
            //swap
            int temp = arr[MinValue];
            arr[MinValue]=arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArr(int arr[]){
        for (int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}



