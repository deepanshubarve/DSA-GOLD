package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackB {
    static class stack{
        static ArrayList <Integer> list = new ArrayList<>();

        //Is Empty function
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        //Push
        public static Boolean push(int data){

            return list.add(data);
        }

        //Pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top= list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
