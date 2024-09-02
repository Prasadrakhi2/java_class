import java.util.*;
public class _07Cycle_Detect{

     // class of graph
     public static class Edge{
        int source;
        int dest;
        // int weight;

        // constructor
        public Edge(int s, int d){
            this.source = s;
            this.dest = d;
            // this.weight = w;
        }
    }
    
    
	// graph create
    @SuppressWarnings("unchecked")
    public static void  graph_create(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }



    // main dfs class
    @SuppressWarnings("unchecked")
    public static boolean cycle_detect(ArrayList<Edge>[] graph){
        boolean vist[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            if(!vist[i]){
                cycle_detect_util(graph,vist,i,-1);  //parent = -1 (not visit by any one)
                return true;
            // cycle exist in one of the part
            }
        }
        return false;

    }


    // helper function
    @SuppressWarnings("unchecked")
    public static boolean cycle_detect_util(ArrayList<Edge>[] graph, boolean vist[], int curr, int par){ //par = parent node
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            // case 3 = neighbour not visit AND check cycle form or not
            if(!vist[e.dest]){
                if(cycle_detect_util(graph, vist, e.dest, curr)){
                    return true;
                }
            }

            // case 1 = neigbour visit and not its parent
            else if(vist[e.dest] && e.dest != par){
                return true;
            }

            // case 2 = neigbour visit and  its parent = do nothing

        }

        return false;
    }


    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
		graph_create(graph);
        System.out.println(cycle_detect(graph));
    }
}