/*
  given are N ropes of diffrent lenght, the task is to connect these ropes into one rope with minimum, such that the cost to connext two ropes is equal to the sum of their lenghts.
 */

// 1.Normal method
import java.util.*;
public class Rope_Cost{

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(6);
        arr.add(3);
        
        Collections.sort(arr);
        System.out.println(arr);
        int i =0;
        int cost = 0;
        while(i<arr.size()-1){
            arr.add(arr.get(i) + arr.get(i+1));
            cost = cost + arr.get(arr.size()-1);
            // System.out.println("cost =" + cost);
            arr.remove(arr.get(i+1));
            arr.remove(arr.get(i));
            // System.out.println(arr);
            Collections.sort(arr);
            // System.out.println(arr);
        }

        System.out.println("cost =" + cost);
    }
}



// 2. By priority queue
import java.util.*;
public class Rope_Cost{
    public static void main(String args[]){

        int rope[] = {2,3,3,4,6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<rope.length; i++){
            pq.add(rope[i]);
        }

        int cost = 0;
        while(pq.size() > 1){
            int min1 = pq.remove();
            int min2 = pq.remove();
            cost += min1 + min2;
            pq.add(min1 + min2);
        }

        System.out.println("cost of the rope = " + cost);
    }
}