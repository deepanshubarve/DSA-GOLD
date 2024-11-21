package Recursion;

public class LastOccurence {
    public static void main(String[] args) {

        int arr[] = {8,3,6,9,5,10,2,5,7};
        System.out.println(LO(arr,0,5));
    }

    public static int LO(int arr[],int i ,int key){

        if(i == arr.length){
            return -1;
        }

        int isFind = LO(arr,i+1,key);
        if(isFind == -1 && arr[i] == key){
            return i;
        }

        return isFind;
    }

}


