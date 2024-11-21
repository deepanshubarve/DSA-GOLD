package Heaps;

import java.util.PriorityQueue;

public class MinDistanceCar {

    public static class point implements Comparable<point>{
        int x;
        int y;
        int disSqr;
        int index;

        public point(int x,int y,int disSqr,int index){
            this.x = x;
            this.y = y;
            this.disSqr = disSqr;
            this.index = index;
        }
        @Override
        public int compareTo(point p2) {
            return this.disSqr - p2.disSqr;
        }
    }
    public static void main(String[] args) {
         int pts [][] = {{1,3},{3,3},{4,8}};
         int k = 2;

        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i = 0;i< pts.length;i++){
            int disSqr = pts[i][0] *pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new point(pts[i][0],pts[i][0],disSqr,i));
        }
        for(int i =0;i<k;i++){
            System.out.println("C" + pq.remove().index);
        }

    }


}
