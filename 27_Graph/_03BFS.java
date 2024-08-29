// BFS => go get imediate neighbours  (queue)

import java.util.*;
public class _03BFS{

    // class of graph
    public static class Edge{
        int source;
        int destination;
        int weight;

        // constructor
        public Edge(int s, int d, int w){
            this.source = s;
            this.destination = d;
            this.weight = w;
        }
    }


    /*
                  1 - - - 3        
                /         | \
              /           |   \
            0             |     5 - - 6
              \           |   /
                \         | /
                  2 - - - 4 
     */

    //construct a graph
    @SuppressWarnings("unchecked")
    public static void c_graph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }


    //bfs code

    @SuppressWarnings("unchecked")
    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[graph.length]; //visited array
        q.add(0); //source edge/node

        while(!q.isEmpty()){
            int curr = q.remove(); // current node store

            if(!vist[curr]){
                System.out.print(curr + " ");
                vist[curr] = true;

                //store the imideate neighbour
                for(int i = 0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.destination);
                }
                
            }
        }

    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        bfs(graph);
        System.out.println();
    }
}