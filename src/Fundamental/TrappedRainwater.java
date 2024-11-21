package Fundamental;

public class TrappedRainwater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(Trapped(arr));
    }

    public static int Trapped(int arr[]){
        int n = arr.length;

        //left max auxilary array - left boundary
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i =1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1] );
        }


        //Right max auxilary array - right boundary

        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max(arr[i],rightMax[i+1] );
        }

        //loop

        int trappedWater =0;

        for(int i =0;i<n;i++){

            //waterlevel = min(left boundary,right boundary)
            int waterLevel = Math.min(leftMax[i],rightMax[i] );

            //trapped water = waterlevel - height[i]
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;



        }
}
