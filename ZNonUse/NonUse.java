import java.util.*;
public class NonUse{
    public static void main(String args[]){
        HashMap<String , Integer> hm = new HashMap<>();
        //add 
        hm.put("rakhi", 19);
        hm.put("riya", 20);
        hm.put("saloni", 21);
        hm.put("vidhi",22);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        System.out.println(hm.entrySet());

        for(String k:keys){
            System.out.println("key = " + k + " , value= " + hm.get(k));
        }
    }
}