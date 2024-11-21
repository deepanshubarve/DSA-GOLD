package Stack;

import java.util.Stack;

public class MaxAHistogram {
    public static void main(String[] args) {
         int arr[] = { 2,1,5,6,2,3};
         maxArea(arr);
    }

    public static void maxArea(int arr[]){

        int maxArea = 0;
        int [] nsl = new int[arr.length];
        int [] nsr = new int[arr.length];

        //next smaller left

        Stack<Integer> s = new Stack<>();

        for(int i = 0;i<arr.length;i++){
            while (!s.isEmpty() && arr[i]<= arr[s.peek()]){
                s.pop();
            }if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }

            s.push(i);
        }
        //next smaller right

         s = new Stack<>();

        for(int i = arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[i]<= arr[s.peek()]){
                s.pop();
            }if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }

            s.push(i);
        }


        //current height
        for (int i = 0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height*width;
            maxArea = Math.max(maxArea,currArea);
        }

        System.out.println("the max area of histogram is " + maxArea);
    }
}
