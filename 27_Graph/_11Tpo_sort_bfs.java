/*
 * topological sorting for BFS => Kahn's Algorithm
 * use "indegree" -> incoming edge
 *      "outdegree" -> outgoing edge
 * for longest path -: stating node -> indegree => 0
 *                     ending node -> outdegree => 0
 * 
 * use queue & indegree
 */

 import java.util.*;
 public class _11Tpo_sort_bfs{

    @SuppressWarnings("unchecked")
    public static class Edge{
        int sorce;
        int dest;

        public Edge(int s, int d){
            this.sorce = s;
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
    
    // indegree function
    @SuppressWarnings("unchecked")
    public static void cal_indee(ArrayList<Edge>[] graph, int indeg[]){
        for(int i=0 ; i<graph.length; i++){
            int curr = i;
            for(int j =0; j<graph[curr].size(); j++){
                Edge e = graph[curr].get(j);
                indeg[e.dest]++;
            }
        }
    }



    @SuppressWarnings("unchecked")
    public static void sort(ArrayList<Edge>[] graph){
        int indeg[] = new int[graph.length]; //indegree arr
        cal_indee(graph,indeg);

        Queue<Integer> q = new LinkedList<>();

        for(int i =0; i<indeg.length; i++){
            if(indeg[i] == 0){
                q.add(i);
            }
        }

        //bfs
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            for(int j=0; j<graph[curr].size(); j++){
                Edge e = graph[curr].get(j);
                indeg[e.dest]--;
                if(indeg[e.dest] == 0){
                    q.add(e.dest);
                }
            }
            
            
        }
        System.out.println();

        
    }




    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        c_graph(graph);
        sort(graph);
    }
 }