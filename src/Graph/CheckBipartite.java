package Graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CheckBipartite {
    static class Edge{
        int src;
        int des;

        public Edge(int s , int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,4));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,0));

    }

    public static boolean isBipartite(ArrayList<Edge> graph[]){
        int []col = new int [graph.length];
        Arrays.fill(col, -1);

        //BFS

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i< graph.length;i++){
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;

                while (!q.isEmpty()){
                    int curr = q.remove();

                    for(int j= 0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);

                        //three condition

                        //1st case :- neighbors has no color

                        if(col[e.des] == -1){
                            int nextcol = col[curr] == 0 ? 1 : 0;
                            col[e.des] = nextcol;
                            q.add(e.des);
                        }

                        //2nd case neighbors has color but same
                        if(col[curr] == col[e.des]){
                            return false;
                        }

                        //3rd case
                        //if neighbors has color and different so no need to change
                        //it will continue and at the end it will give true

                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }

}
