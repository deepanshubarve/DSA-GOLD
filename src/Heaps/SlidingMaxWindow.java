package Heaps;

import java.util.PriorityQueue;

public class SlidingMaxWindow {

    static class Pair implements Comparable<Pair>{
        int val;
        int index;

        public Pair(int val,int index){
            this.val = val;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p2) {
            return p2.val-this.val;
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,3,-1,3,5,3,6,7};
        int k = 3;

        //solution
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int n = arr.length;
        int res[] = new int[n-k+1];

        for(int i =0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }

        res[0] = pq.peek().val;

        for(int i = k;i<n;i++) {
            while(pq.size()>0 && pq.peek().index <= (i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i ));
            res[i-k+1] = pq.peek().val;
        }

        //print result
        for (int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
