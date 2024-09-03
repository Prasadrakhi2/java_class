/* Bipartite -> *whose vertices can divid in 2 independent set i.e (2 vertex of 1 edge place in diffrent sets) 
           * use graph coloring => adjecent vertex have diffrent colore.
           * posible => 1. Acyclic graph  2. even vetex graph 
           *            if odd -> not bipartite
*/
// Bfs

import java.util.*;
public class _08Bipartit_coloring{

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

        graph[0].add(new Edge(0, 1));
        // graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        // graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }



    /*
     * 0 -> white
     * 1 -> black
     * -1 -> non
     */

    // bipartite (BFS main function)
    @SuppressWarnings("unchecked")
    public static boolean isbipartite(ArrayList<Edge>[] graph){
        int col[] = new int[graph.length]; //coloure array -> like visited

        //starting -> all node -> without colore  i.e -1
        for(int i=0; i<graph.length; i++){
            col[i] = -1;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<graph.length; i++){
            if(col[i] == -1){ //BFS
                q.add(i);
                col[i] = 0;  //starting node

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);

                        //case 1 => neighboure -> colore -> non
                        if(col[e.dest] == -1 ){
                            int nextCol = col[curr] == 0? 1:0;
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }

                        // case 2 -> curr colore = neighbour colore
                        else if(col[curr] ==col[e.dest]){
                            return false;
                        }
                    }
                }
            }

        }

        // all neihbour => diff col
        return true;
    }


    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        /*
                  1 - - - 3        
                /         | \
              /           |   \
            0             |     5 - - 6
              \           |   /
                \         | /
                  2 - - - 4 
     */
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        c_graph(graph);
        System.out.println(isbipartite(graph));
    }
}