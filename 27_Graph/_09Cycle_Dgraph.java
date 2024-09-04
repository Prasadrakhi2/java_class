// directed graph
import java.util.*;
public class _09Cycle_Dgraph{


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
     *    0 - - - > 1 < - - - 2
     *                        ^
     *                      / |
     *                    /   |
     *                   >    |
     *                  3 - ->4   
     * 
     * 
     */                     


    @SuppressWarnings("unchecked")
    public static void  c_graph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));

        graph[2].add(new Edge(2,1));
        // graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
    }


    // main is cycle function
    @SuppressWarnings("unchecked")
    public static boolean ischack(ArrayList<Edge>[] graph){
        boolean vist[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vist[i]){
                ischackutil(graph,i, vist, stack);
                return true;
            }
        }
        return false;
    }


    // helper fun
    @SuppressWarnings("unchecked")
    public static boolean ischackutil(ArrayList<Edge>[] graph, int curr, boolean vist[], boolean stack[]){
        vist[curr] = true;
        stack[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            // already neighbour present in stack
            if(stack[e.dest]){
                return true;
            }

            //not present then check visit and iscycle
            else if(!vist[e.dest] && ischackutil(graph,e.dest, vist, stack)){
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        System.out.println(ischack(graph));
    }
}