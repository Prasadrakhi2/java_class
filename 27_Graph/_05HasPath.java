// DFS => depth first search (stack) => go to 1st neighbour
import java.util.*;
public class _05HasPath{

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

    @SuppressWarnings("unchecked")
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vist[]){
        System.out.print(curr + " ");
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.destination]){
                dfs(graph, e.destination, vist);
            }
        }
    }


    // has path
    @SuppressWarnings("unchecked")
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int des, boolean vist[]){
        if(src == des){
            return true;
        }

        vist[src] = true;

        //check if neighbour has path
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);

            if(!vist[e.destination] && hasPath(graph, e.destination,  des, vist)){
                return true;
            }
        }

        return false;
    }



    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        // dfs(graph, 0, new boolean[V]);
        System.out.println(hasPath(graph, 0, 5, new boolean[V]));
        System.out.println(hasPath(graph, 0, 7, new boolean[V]));
        System.out.println();
    }
}