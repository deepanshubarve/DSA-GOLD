package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static void main(String[] args) {
       String str= "(a+b) ";
        System.out.println(dupli(str));
    }

    public static boolean dupli(String str){

        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                int count = 0;
                while (s.pop()!= '('){
                    count++;
                }

                if(count<1){
                    return true;
                }
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

}
