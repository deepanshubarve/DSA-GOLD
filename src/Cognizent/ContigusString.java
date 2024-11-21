package Cognizent;

import java.util.Scanner;

public class ContigusString {

    public static void main(String[] args) {
        String s = "FFFFIFFIFFFII";
        int n = s.length();
        int ans = solve(n,s);
        System.out.println(ans);
    }

    public static int solve(int n,String s){
        int [] ans = new int [2];
        int i = 0;
        boolean flag=true;
        int count = 0;
        while(i<n){
            if(s.charAt(i) == 'I'){
                count++;
                if(count == 2&&flag){
                    ans[0] = i;
                    flag=false;
                }
                ans[1] = i;
            }
           i++;

        }
        return ans[1]-ans[0]+1;
    }


}
