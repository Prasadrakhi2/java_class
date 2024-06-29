import java.util.*;
public class Priorityqueue{

    public static void main(String args[]){
        //Syntex
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //print in assending order

        //for decendind / reverse order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(4);
        pq.add(3);
        pq.add(5);
        pq.add(1);

        //print
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}