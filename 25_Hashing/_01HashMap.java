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