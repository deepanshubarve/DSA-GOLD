package Graph;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class DetectCycleDirected {
    static class Edge{
        int src;
        int des;

        public Edge(int s,int d ){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(1,3));
        graph[3].add(new Edge(1,0));
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for(int i = 0;i< graph.length;i++){
            if(!vis[i]){
                isCycleUtil(graph,i,vis,stack);
                return true;
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge> graph[] , int curr, boolean[] vis,boolean[] stack){

        vis[curr] = true;
        stack[curr]= true;

        for (int  i = 0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);

            if(stack[e.des]){
                return true;
            }

            if(!vis[e.des] && isCycleUtil(graph, e.des, vis,stack)){
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }


}
