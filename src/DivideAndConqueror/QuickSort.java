package DivideAndConqueror;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        quicksort(arr,0, arr.length-1);
        printArr(arr);
    }
    public static void printArr(int arr[]){
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[],int si,int ei){

        if(si>=ei){
            return;
        }
        //last element
        int pIdx = partition(arr,si,ei);
        quicksort(arr,si,pIdx);
        quicksort(arr,pIdx+1,ei);


    }
    public static int partition(int[] arr, int si, int ei) {
        int pivot = 0;
        int i = si -1;

        for(int j=si;j< ei;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
    }
        i++;
        //swap
        int temp =pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;

    }
}
