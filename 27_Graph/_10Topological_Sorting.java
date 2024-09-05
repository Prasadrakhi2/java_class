/* use -> DAG ->(directed but Acyclic graph)
 *        in every edge 'u-v' 'u' comes first befor 'v' in sorting
 *        use in -> dependency graph (curr node depends on previous node)
 *        use -> DFS with STACk
 *        O(V+E)
 */

 import java.util.*;
 public class _10Topological_Sorting{

    @SuppressWarnings("unchecked")
    public static class Edge{
        int source;
        int dest;

        public Edge(int s, int d){
            this.source = s;
            this.dest = d;
        }
    }


    @SuppressWarnings("unchecked")
    public static void c_graph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

// main dfs function
    @SuppressWarnings("unchecked")
    public static void topology(ArrayList<Edge>[] graph){
        boolean vist[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for(int i=0; i<graph.length; i++){
            if(!vist[i]){
                topologyUtil(graph,i,vist,s);
            }
        }

        // remove and print
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }

        System.out.println();
    }


    // helper function
    @SuppressWarnings("unchecked")
    public static void topologyUtil(ArrayList<Edge>[] graph, int curr, boolean vist[],  Stack<Integer> s){
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vist[e.dest]){
                topologyUtil(graph, e.dest, vist, s);
            }
        }
        s.push(curr);

    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        topology(graph);
    }
 }