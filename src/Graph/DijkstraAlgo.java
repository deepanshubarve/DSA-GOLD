package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    public static void createGrpah(ArrayList<Edge> graph[]){
        for(int i =0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,5,5));
        graph[4].add(new Edge(4,3,2));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path;

        public Pair(int n ,int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }
    }

    public static void dijsktra(ArrayList<Edge> graph[],int src){
        int dis[] = new int[graph.length];
        for (int i =0;i <graph.length;i++){
            if(src != i){
                dis[i] = Integer.MAX_VALUE;
            }
        }

        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(src,0));

        //loop
        while(!pq.isEmpty()){

            Pair curr = pq.remove();
            if(!visited[curr.n]){
                visited[curr.n] = true;
                //neibours
                for (int j =0; j<graph[curr.n].size();j++){
                    Edge e = graph[curr.n].get(j);
                    int u = e.src;
                    int v = e.des;
                    int w = e.wt;

                    //dijskstra condition
                    if(dis[u] + w < dis[v] ){
                        dis[v] = dis[u]+w;
                        pq.add(new Pair(v,dis[v]));
                    }
                }
            }
        }

        //print all the distance
        for (int i =0;i< dis.length;i++){
            System.out.print(dis[i]+ " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[6];
        int src = 0;
        createGrpah(graph);
        dijsktra(graph,src);
    }
}
