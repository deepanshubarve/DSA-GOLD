package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = { 6,8,0,1,3};
        int GreatNext[] = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
                if(s.isEmpty()){
                    GreatNext[i] = -1;
                }else {
                    GreatNext[i] = arr[s.peek()];
                }

                s.push(i);
            }

        for (int i = 0;i< GreatNext.length;i++){
            System.out.print(GreatNext[i] + " ");
        }
        System.out.println();
        }
    }

