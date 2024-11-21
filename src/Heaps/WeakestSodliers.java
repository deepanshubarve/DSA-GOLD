package Heaps;

import java.util.PriorityQueue;

public class WeakestSodliers {

    public static class row implements Comparable<row>{
        int soldiers;
        int idx;

        public row(int soldiers,int idx){
            this.soldiers = soldiers;
            this.idx = idx;
        }

        @Override
        public int compareTo(row Row2){
            if(this.soldiers == Row2.soldiers){
                return this.idx - Row2.idx;
            }else {
                return this.soldiers - Row2.soldiers;
            }
        }

    }
    public static void main(String[] args) {
        int soldier[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;

        PriorityQueue<row> pq = new PriorityQueue<>();
        for(int i = 0;i<soldier.length;i++){
            int count = 0;
            for (int j =0;j < soldier[0].length;j++){
                count += soldier[i][j] == 1 ? 1 : 0;
            }
            pq.add(new row(count,i));
        }

        for (int i =0;i<k;i++){
            System.out.println("the give ans" + pq.remove().idx);
        }

    }
}
