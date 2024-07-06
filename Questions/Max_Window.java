import java.util.*;
public class Max_Window{
    
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=1; i<=10; i++){
            list.add(i);
        }

        System.out.println(list);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int k = 3;
        int i=0;
        while(i<list.size()-2){
            int max = 0;
            for(int j=0; j<k; j++){
                max = Math.max(max, list.get(j));
            }
            // max = Math.max((Math.max(list.get(i),list.get(i+1))),list.get(i+2));
            pq.add(max);
            list.remove(list.get(i));
        }

        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
        System.out.println();
    }
}