/*
                        (2)
            0        2- - - 4
             \ (1)  / \
         (5)  \    /   \ (2)
               \  /.    \
                1 - - - - 3
                 (3) 

   */


import java.util.*;
public class _02AdjacencyList{

    @SuppressWarnings("unchecked")
    public static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }


    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];   //this is currently null 

        //make the arraylist at every array index
        for(int i =0; i<V; i++){
            graph[i] = new ArrayList<>();
        }

        //0->vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1->vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2->vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3->vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4->vertex
        graph[4].add(new Edge(4, 2, 2));

        //3's neighbour
        for(int i=0; i<graph[3].size(); i++){
            Edge e = graph[3].get(i);
            System.out.println(e.destination);
        }
    }
}