package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapVariable {
    public static void main(String[] args) {

        int idx1 = 1;
        int idx2 = 4;
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(1);


        System.out.println(list);
       // swap(list,idx1,idx2);

        //for acceding sorting
        Collections.sort(list);
        //for decending sorting
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
}
