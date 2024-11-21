package Fundamental;

public class PairsOfArray {
    public static void main(String[] args) {
        int numbers[] = {32,34,23,12,53};
        pair(numbers);
    }
    public static void pair(int numbers[]){
        int tp =0;
        for(int i =0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j =i+1;j<numbers.length;j++){
                System.out.print("(" + curr+","+numbers[j]+")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("The total pair are "+tp);
    }
}
