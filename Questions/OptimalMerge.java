import java.util.*;
public class OptimalMerge{

    public static int merge(ArrayList<Integer> list){
        int i = 0;
        int minSum = 0;
        while(i<list.size()-1){
            int next = list.get(i) + list.get(i+1);
            list.add(next);
            list.remove(list.get(i+1));
            list.remove(list.get(i)); 
            Collections.sort(list);
            System.out.println(list);
            minSum += next;
        }
        System.out.println();
        return minSum;
    }

    

    public static void main(String args[]){
        
        System.out.println();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(13);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("minimum sum = " + merge(list));
        System.out.println();
        
    }
}