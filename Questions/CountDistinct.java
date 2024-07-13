/* count the distinct elenent */

import java.util.*;
public class CountDistinct{

    public static int countdistictElement(int a[]){
        HashSet<Integer> set = new HashSet<>();
        
        // int count = 0;

        // for(int i=0; i<a.length;  i++){
        //     if(!set.contains(a[i])){
        //         set.add(a[i]);
        //         count++;
        //     }
            
        // }

        // return count;

        // OR O(n)
        for(int i=0; i<a.length; i++){
            set.add(a[i]);
        }
        return set.size();
    }

    public static void main(String args[]){
        int a[] = {4,3,2,5,6,7,3,4,2,1};

        System.out.println(countdistictElement(a));

    }
}