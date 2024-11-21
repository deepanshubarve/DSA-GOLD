package Fundamental;

public class MInMAx {
    public static void main(String[] args) {
        int numbers[] = {88,34,22,5,444};
        System.out.println("The largest number is " +Largest(numbers));
    }

    public static int Largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i =0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
        }

        for (int i =0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest value is " + smallest);
        return largest;
    }
}
