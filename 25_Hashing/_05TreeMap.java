//key are in sorted form
// O(log n)
//data structure => Red Black Tree
// syntex => TreeMap<key, value> name = new TreeMap<>();

import java.util.*;
public class _05TreeMap{

    public static void main(String ags[]){
        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("india", 22);
        tm.put("china", 24);
        tm.put("shrilanka", 25);
        tm.put("afganistan", 26);

        System.out.println(tm);
    }
}