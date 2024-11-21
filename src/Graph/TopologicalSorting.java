package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    static class Edge{
        int src;
        int des;

        public Edge(int s,int d){
            this.src = s;
            this.des = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0;i<graph.length;i++){
            if(!visited[i]){
                topSortUtil(graph,i,visited,st);
            }
        }

        while(!st.isEmpty()){
            System.out.println(st.pop()+" ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[] , int curr,boolean[] visited,Stack<Integer> st){

        visited[curr] = true;

        for(int i =0; i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.des]){
                topSortUtil(graph, e.des,visited,st);
            }
        }

        st.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topSort(graph);

    }
}
