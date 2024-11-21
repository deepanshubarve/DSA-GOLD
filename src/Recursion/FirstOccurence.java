package Recursion;

public class FirstOccurence {
    public static void main(String[] args) {

        int arr[] = {8,3,6,9,5,10,2,5,7};
        System.out.println(FO(arr,0,1));
    }

    public static int FO(int arr[],int i ,int key){

        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return FO(arr,i+1,key);
    }

}
