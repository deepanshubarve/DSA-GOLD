package TCS;

import java.util.*;




public class SortByFreq {

    public static class Pair{
        int first;
        int second;

        public Pair(int f,int s){
            this.first = f;
            this.second =s;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,4,3,3,3};
        sortByF(arr);
    }

    public static void sortByF(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(arr);
        ArrayList<Pair> list  = new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(new Pair(entry.getKey(), entry.getValue()));
        }

        Collections.sort(list,(a,b) -> {
            if(a.second == b.second)
                return a.first-b.first;
            else return b.second-a.second;
        });

        for(int i =0;i<list.size();i++){
            while (list.get(i).second > 0){
                System.out.println(list.get(i).first);
                list.get(i).second--;
            }
        }


    }
}
