package HashMap;

import Queues.InterleaveQueue;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {1,3,2,5,1,3,1,5,1};
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key : map.keySet()){
            if(map.get(key) > n/3) {
                System.out.print(key);
            }
        }
    }
}
