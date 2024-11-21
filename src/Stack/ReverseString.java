package Stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Barve Deepanshu";
        String res = reverse(str);
        System.out.println(res);

    }

    public static String reverse(String str) {
          Stack<Character> s = new Stack<>();
          int idx = 0;
          while(idx< str.length()){
              s.push(str.charAt(idx));
              idx++;
          }

          StringBuilder sb = new StringBuilder(" ");
          while(!s.isEmpty()){
              char curr = s.pop();
              sb.append(curr);
          }

          str = sb.toString();
          return str;
    }


}
