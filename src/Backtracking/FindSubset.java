package Backtracking;

public class FindSubset {
    public static void main(String[] args) {
       String str = "abc";
       Subset(str,0," ");
    }
    public static void Subset(String str, int i ,String ans){

        if(i == str.length()) {
            if (str.length() == 0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //yes choice
        Subset(str,i+1,ans+str.charAt(i));
        //NO choice
        Subset(str,i+1,ans);
    }
}
