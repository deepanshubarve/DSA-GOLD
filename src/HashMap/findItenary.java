package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class findItenary {

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String ,String> revmap = new HashMap<>();

        for(String key : tickets.keySet()){
            revmap.put(tickets.get(key),key);
        }

        for (String key : tickets.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("mum","deh");
        tickets.put("che","bang");
        tickets.put("goa","che");
        tickets.put("deh","goa");

        String start = getStart(tickets);
        System.out.print(start+" ->");
        for(String key : tickets.keySet()){
            System.out.print(tickets.get(start)+"->");
            start = tickets.get(start);
        }

    }
}
