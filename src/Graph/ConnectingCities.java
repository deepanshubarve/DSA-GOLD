package Graph;

import java.util.PriorityQueue;

public class ConnectingCities {
    static class Edge implements Comparable<Edge>{
        int des;
        int w;
        public  Edge(int d,int w){
            this.des = d;
            this.w = w;
        }

        @Override
        public int compareTo(Edge p2){
            return this.w - p2.w;
        }

    }

    public static int connectingCities(int[][] cities){
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] visited = new boolean[cities.length];
        int finalAns = 0;
        pq.add(new Edge(0,0));

        while (!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!visited[curr.des]){
                visited[curr.des] = true;
                finalAns+= curr.w;

                for (int i =0;i<cities[curr.des].length;i++){
                    if(cities[curr.des][i] != 0){  //cities[curr.des][i] ka matlab hai curr ki destination se i'th node tal ki cost/wt;
                        pq.add(new Edge(i, cities[curr.des][i]));
                    }
                }
            }
        }
        return finalAns;

    }

    public static void main(String[] args) {
        int [][]cities = {{0,1,2,3,4},
                {1,0,5,0,7},
                {2,5,0,6,0},
                {3,0,6,0,0},
                {4,7,0,0,0}};
        System.out.println(connectingCities(cities));
    }
}
