/* Null is not allowed */

import java.util.*;
public class _09TreeSet{
    public static void main(String args[]){
        TreeSet<String> lhs = new TreeSet<>();
        lhs.add("india");
        lhs.add("bangladesh");
        lhs.add("pakistan");
        lhs.add("bhutan");

        // System.out.println(lhs);

        Iterator it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}