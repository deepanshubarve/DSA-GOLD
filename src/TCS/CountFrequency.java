package TCS;

import Queues.InterleaveQueue;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[]arr = {10,5,10,15,10};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int a = 0;a< arr.length;a++){
            if(map.containsKey(a)){
                map.put(arr[a], map.get(arr[a] +1));
            }else{
                map.put(arr[a],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
