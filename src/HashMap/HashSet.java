package HashMap;

import java.util.Iterator;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String > hm = new java.util.HashSet<>();
        hm.add("seoni");
        hm.add("chh");
        hm.add("bal");
        hm.add("mol");

       /* Iterator it = hm.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        for (String citu : hm){
            System.out.println(citu);
        }

        TreeSet<String> ts  = new TreeSet<>();
        hm.add("seoni");
        hm.add("chh");
        hm.add("bal");
        hm.add("mol");
        System.out.println(ts);

    }
}
