package Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class kruskalsAlgo {
    static class Edge implements Comparable<Edge> {
        int src;
        int des;
        int wt;
        public Edge(int s, int d, int w) {
            this.des = d;
            this.src = s;
            this.wt = w;
        }
        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;

        }
    }

        public static void createGraph(ArrayList<Edge> edges){
            edges.add(new Edge(0,1,10));
            edges.add(new Edge(0,2,15));
            edges.add(new Edge(0,3,30));
            edges.add(new Edge(1,3,40));
            edges.add(new Edge(2,3,50));
        }

        public static int n = 4;
        static int rank[] = new int[n];
        static int parent[] = new int[n];

        public static void init(){
            for (int i = 0;i<n;i++){
              parent[i] = i;
            }
        }

        public static int find(int x){
            if(x==parent[x]){
                return x;
            }
            return parent[x] = find(parent[x]);
        }

        public static void union(int a, int b){
            int parA = find(a);
            int parB = find(b);

            if(rank[parA] == rank[parB]){
                parent[parB] = parA;
                rank[parA]++;
            }else if (rank[parA] < rank[parB]){
                parent[parA] = parB;
            }else {
                parent[parB] = parA;
            }
        }

        public static void kruskal(ArrayList<Edge>edges,int v){
            init();
            Collections.sort(edges);
            int mstCost = 0;
            int count = 0;

            for(int i = 0;count<v-1;i++){
                Edge e = edges.get(i);
                int parA = find(e.src);
                int parB = find(e.des);
                if(parA != parB){
                    union(e.src,e.des);
                    mstCost += e.wt;
                    count++;
                }
            }
            System.out.println(mstCost);
        }

        public static void main(String[] args) {
            int v= 4;
            ArrayList<Edge> edges = new ArrayList<>();
            createGraph(edges);
            kruskal(edges,v);
        }
    }

