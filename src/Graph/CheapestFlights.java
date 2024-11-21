package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlights {

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

    public static void createGraph(int flights[][], ArrayList<Edge> graph[]){
        for(int i =0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i =0;i< flights.length;i++){
            int src = flights[i][0];
            int des = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src,des,wt);
            graph[src].add(e);
        }
    }

    static class Info{
        int ver;
        int cost;
        int stops;

        public Info(int v,int c,int st){
            this.ver = v;
            this.cost = c;
            this.stops = st;
        }
    }


    public static int cheapestFlight(int n, int flight[][],int src,int des,int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight,graph);

        int dis[] = new int[n];
        for(int i = 0;i<graph.length;i++){
            if(i != src){
              dis[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> queue = new LinkedList<>();
        queue.add(new Info(src,0,0));

        while (!queue.isEmpty()){
            Info curr = queue.remove();
            if( curr.stops > k){
                break;
            }
            for(int i =0;i<graph[curr.ver].size();i++){
                Edge e  = graph[curr.ver].get(i);
                int u = e.src;
                int v = e.des;
                int w = e.wt;

                if(curr.cost + w < dis[v] && curr.stops <= k){
                    dis[v] = curr.cost + w;
                    queue.add(new Info(v,dis[v],curr.stops+1 ));
                }

            }

        }
        if(dis[des] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dis[des];
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0; int des = 3 ; int k = 1;
        System.out.println(cheapestFlight(n,flights,src,des,k));
    }


}
