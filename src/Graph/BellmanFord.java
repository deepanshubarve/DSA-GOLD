package Graph;

import java.util.ArrayList;

public class BellmanFord {
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

    public static void createGraph(ArrayList<Edge> graph ){
       graph.add(new Edge(0,1,2));
       graph.add(new Edge(0,2,4));
       graph.add(new Edge(1,2,-4));
       graph.add(new Edge(2,3,2));
       graph.add(new Edge(3,4,4));
       graph.add(new Edge(4,1,1));

        }


    public static void bellmenFord(ArrayList<Edge> graph , int src,int V){
        int dist[] = new int[graph.size()];
        for(int i =0;i< graph.size();i++){
            if(src != i){
                dist[i] = Integer.MAX_VALUE;
            }
        }


        for(int i =0;i<V-1;i++){
            //edge
                 for(int j =0;j<graph.size();j++){
                    Edge e = graph.get(j);
                    int u = e.src;
                    int v = e.des;
                    int w = e.wt;

                    if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]){
                        dist[v] = dist[u] + w;
                    }
                }
            }


        for (int i =0;i< dist.length;i++){
            System.out.println(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v= 6;
        ArrayList<Edge> graph = new ArrayList<>();
        createGraph(graph);
        bellmenFord(graph,0,v);
    }
}
