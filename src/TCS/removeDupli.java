package TCS;

import java.util.ArrayList;

public class removeDupli {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4,5};
        int k = remove(arr);
        for(int i =0;i<k;i++){
            System.out.println(arr[i]);
        }

    }

    public static int remove(int arr[]){
        int i = 0;
        for(int j = 0;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }

        return i+1;

    }

}
