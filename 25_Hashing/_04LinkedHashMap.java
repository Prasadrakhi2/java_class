// syntex => LinkedHashMap<key,value> name = new LinkedHashMap<>();
// O(1) ,
// use datastructure => doubley linked list

import java.util.*;
public class _04LinkedHashMap{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        hm.put("india", 22);
        hm.put("china", 24);
        hm.put("shrilanka", 25);
        hm.put("afganistan", 26);

        System.out.println(hm);
        System.out.println(hm.remove("china"));
        
        System.out.println(hm.get("india"));
        
        hm.clear();
        System.out.println(hm.isEmpty())
;    }
}