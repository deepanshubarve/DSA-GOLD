package TCS;

public class maxProduct {
    public static void main(String[] args) {

        int[] arr =  {1,2,-3,0,-4,-5};
        int pref = 1;
        int suff = 1;
        int n = arr.length;
        int ans = 0;

        for(int i =0;i<arr.length;i++){

            if(pref == 0){
                pref = 1;
            }

            if(suff == 0){
                suff = 1;
            }
            pref *= arr[i];
            suff *= arr[n-i-1];

            ans = Math.max(ans,Math.max(pref,suff));
        }

        System.out.println(ans);

    }
}
