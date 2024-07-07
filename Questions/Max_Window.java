/*
  Sliding Window maximum(Maximum of all subarrays of size K)
 */

// import java.util.*;
// public class Max_Window{
    
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=1; i<=10; i++){
//             list.add(i);
//         }

//         System.out.println(list);

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         int k = 3;
//         int i=0;
//         while(i<list.size()-2){
//             int max = 0;
//             for(int j=0; j<k; j++){
//                 max = Math.max(max, list.get(j));
//             }
//             // max = Math.max((Math.max(list.get(i),list.get(i+1))),list.get(i+2));
//             pq.add(max);
//             list.remove(list.get(i));
//         }

//         while(!pq.isEmpty()){
//             System.out.print(pq.peek() + " ");
//             pq.remove();
//         }
//         System.out.println();
//     }
// }



/*right solution  O(n log n) */
import java.util.*;
public class Max_Window{

    public static class Pair implements Comparable<Pair>{
        int value;
        int indx;

        public Pair(int value, int indx){
            this.value= value;
            this.indx = indx;
        }

        @Override
        public int compareTo(Pair p2){
            //ass => this.value - p2.value
            //dessending ->
            return p2.value - this.value;
        }
    }

    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        //store the first k element in pq
        for(int i=0; i<k; i++){
            pq.add(new Pair(arr[i],i));
        }

        //add in window arr the max of first 3 element
        int wind[] = new int[arr.length-k+1]; //n-k+1
        wind[0] = pq.peek().value;

        //for the max between other remaining pairs
        for(int i=k; i<arr.length; i++){
            //chexk the peek element index is not <= to the i-k index
            while(pq.peek().indx <= (i-k)){
                pq.remove();
            }

            //add the new element in pq
            pq.add(new Pair(arr[i],i));
            wind[i-k+1] = pq.peek().value;
        }

        //print the window arr
        for(int i=0; i<wind.length; i++){
            System.out.print(wind[i] + " ");
        }
        System.out.println();
    }
}