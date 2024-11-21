package Backtracking;

public class FindPermutation {
    public static void main(String[] args) {
        String str = "abc";
        findPermu(str," ");
    }

    public static void findPermu(String str,String ans){

        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }


        for(int i = 0;i<str.length();i++){
            char ch  = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermu(newStr,ans+ch);
        }
    }
}
