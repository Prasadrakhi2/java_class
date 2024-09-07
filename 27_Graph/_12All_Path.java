// find all posible path from source to destination
// O(n^n) due to recursion tree

import java.util.*;
public class _12All_Path{


    @SuppressWarnings("unchecked")
    public static class Edge{
        int source;
        int dest;

        public Edge(int s, int d){
            this.source = s;
            this.dest = d;
        }
    }

    /*
     *          5                   4
     *          | \               / |
                |    \         /    |
                |       \ > </      |
                |         0         |
                |         |         |
                >         >         >
                2 - - - > 3 - - - > 1 
*/

    @SuppressWarnings("unchecked")
    public static void c_graph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new  ArrayList<>();
        }

        graph[0].add(new Edge(0, 3));

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }



    @SuppressWarnings("unchecked")
    public static void path(ArrayList<Edge>[] grap, int s, int d, String paths){
        //base condition
        if(s == d){
            System.out.println(paths+ d);
            return;
        }

        //check for neighbour
        for(int i = 0; i<grap[s].size(); i++){
            Edge e = grap[s].get(i);
            path(grap, e.dest, d, paths+s+" ");  //s=source , d= destination
            
        }
    }


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        path(graph, 5, 1 ,"");  //""-> empty string
    }
}
