public class ReverseArray {
    public static void main(String[] args) {

        int numbers[]={10,22,33,44,55};
        reverse(numbers);
        for(int i =0;i<= numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int numbers[]){
        int start = 0;
        int last =  numbers.length-1;

        while (start<last){
            //swap

            int temp = numbers[last];
            numbers[last] = numbers[start];
            numbers[start] = temp;

            start++;
            last--;
        }
    }
}
