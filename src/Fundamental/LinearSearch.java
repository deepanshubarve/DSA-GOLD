package Fundamental;

public class LinearSearch {
    public static void main(String[] args) {

        int numbers[] = {10,22,33,44,55,66,77};
        int key = 33;
        int index = SearchKey(numbers,key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }else {
            System.out.println("The key is " + index);
        }
    }

    public static int SearchKey(int[] numbers, int key){
       for(int i = 0;i<numbers.length;i++){
           if(numbers[i] == key){
               return i;
           }
       }
        return -1;
    }
}
