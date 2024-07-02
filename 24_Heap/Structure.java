import java.util.*;
public class Structure{
    
    public static class Heap{

        ArrayList<Integer> arr = new ArrayList<>();

        //add function
        public void add(int data){
            //add at last index
            arr.add(data);

            //fix data value in heap
            int x = arr.size()-1;
            int child = x;  //child
            int par = (x-1)/2; //parent node

            while(arr.get(child) < arr.get(par)){
                //swap
                int temp = arr.get(child);
                arr.set(child, arr.get(par));
                arr.set(par, temp);

                child = par;
                par = (x-1)/2;
            }

        }

        //peek function
        public int peek(){
            return arr.get(0);
        }

        //heapify function
        private void heapify(int i){
            int left = 2*i+1;   //left child
            int right = 2*i+2;    //right child

            int minid = i;  //min index
            //find min
            if(left < arr.size() && arr.get(minid) > arr.get(left)){
                minid = left;
            }

            if(right < arr.size() && arr.get(minid) > arr.get(right)){
                minid = right;
            }

            if(minid != i){  //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minid));
                arr.set(minid, temp);

                heapify(minid);
            }

        }

        //remove function
        public int remove(){
            //swap 1st and last element
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //remove last element
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String args[]){
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
       
       
       

        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}