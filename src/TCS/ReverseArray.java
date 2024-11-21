package TCS;

import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        Stack<Integer> st = new Stack<>();

        for(int i =0;i<arr.length;i++){
            st.push(arr[i]);
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }
}
