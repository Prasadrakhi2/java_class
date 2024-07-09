import java.util.*;
public class _02Iterate{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India", 150);
        hm.put("china" , 120);
        hm.put("indonasia" , 160);
        hm.put("america" , 140);

        //1.use set() method for iterate
        //2. syntex -> Set<type of key> name = name of hash map.keySet()
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        // use for each loop
        for(String i : keys){
            System.out.println("keys = " + i + " , values = " + hm.get(i));
        }

        
        //3. EnterySet method are also use for iteration
        System.out.println(hm.entrySet());
    }
}