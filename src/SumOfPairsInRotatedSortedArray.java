public class SumOfPairsInRotatedSortedArray {
    public static void main(String[] args) {

        int nums[] = { 11, 15, 6, 8, 9, 10 };
        int x = 16;
        int n = nums.length;

        if (PairsSum(nums,n,x))
            System.out.print("true");

        else
            System.out.print("false");
    }

    public static boolean PairsSum(int nums[],int n ,int x){

        int ni = nums.length;
        int i;

        for(i = 0;i<ni;i++)
            if(nums[i] > nums[i+1])
                break;

            int left = (i+1) % n;

            int right = i;

           while (left!= right){

               if(nums[left] + nums[right] == x)
                   return true;

               if(nums[left] + nums[right] < n)
                   left = (left +1) % n;

               else
                   right = (n+right -1)% n ;



           }
           return false;
        }

    }

