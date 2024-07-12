import java.util.*;
public class _07IterationInSet{

    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();

        set.add("India");
        set.add("indonasia");
        set.add("bangladesh");
        set.add("newziland");

        //1. by foreach loop =>O(n)
        // for(String s : set){
        //     System.out.println(s);
        // }

        //2. inbuild iterator => O(n)
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}