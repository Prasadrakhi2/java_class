// Hashing -> convert one data type into another
/*
 * type -> map (store the value in key and value pair)
           set

    map -> 1.HashMap -> unorder , O(1) , linked list(LL)
           2.Linked HashMap => order form i.e print the value in the order we give ,O(1) , doubliyLL
           3.treeMap -> key are sort, O(log n) , Red Black Tree
 */

 /* HashMap syntex => HashMap<key,value> name = new HashMap<>(); */

import java.util.*;
public class _01HashMap{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();

        //insertion  -> put(key,value)
        hm.put("india", 150);
        hm.put("china" , 120);
        hm.put("indonasia" , 230);
        hm.put("americar" , 210);
        System.out.println(hm);

        //get  -> get(key)
        System.out.println(hm.get("china"));

        //remove -> remove(key) it also give the vlue of the remove key
        System.out.println(hm.remove("indonasia"));
        System.out.println(hm.remove("israil"));
        System.out.println(hm);

        //contain key  -> give true or false
        System.out.println(hm.containsKey("indonasia"));
        System.out.println(hm.containsKey("india"));

        //size 
        System.out.println(hm.size());

        //clear -> clear all the data
        hm.clear();
        System.out.println(hm);
    }
}