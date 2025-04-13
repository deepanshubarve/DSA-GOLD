package TCS;

public class equillibriumIndex {
    public static void main(String[] args) {
        int [] arr = {2,3,-1,8,4};
        int index = findEquli(arr);
        System.out.println(index);


    }

    public static int findEquli(int[]arr){
        int total = 0;
        for(int n : arr){
            total+=n;
        }

        int leftSum = 0;
        int rightSum = total;

        for(int i =0;i<arr.length;i++){
            rightSum -= arr[i];
            if(rightSum == leftSum){
                return i ;
            }
            leftSum += arr[i];
        }
        return -1;
    }

}
