/*
 * HashSet = store unique elements, store the elements in the form of nodes 
 *          "implementation by the HashMap ie the element store as key and the values are in dumy form"
 * unorder,  *Null is allowed
 
 * Syntex => HashSet<data_type> name = new HashSet<>(;  
 */

import java.util.*;
public class _06HashSet{
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();

        //O(1)
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println(set);
        set.remove(2);
        
        System.out.println(set.contains(3));
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
        
    }
}
