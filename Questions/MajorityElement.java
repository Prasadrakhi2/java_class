

import java.util.*;
public class MajorityElement{
    public static void main(String args[]){
        int num[] = {1,3,2,5,1,3,1,5,1};
        int n = num.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        int no =0;
        for(int i=0; i<n; i++){
            no = num[i];
            if(map.containsKey(no)){
                map.put(no,map.get(no)+1);
            }
            else{
                map.put(no,1);
            }

        }

        /* OR */
        //use getOrDefault operater
        // for(int i=0; i<n/2; i++){
        //     map.put(num[i], map.getOrDefault(num[i], 0) +1);
        // }

        System.out.println(map);

        Set<Integer> keySet = map.keySet();
        for(Integer key : keySet){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }

        /*Or */
        // for(Integer key : map.keySet()){
        //         if(map.get(key) > n/3){
        //             System.out.println(key);
        //         }
        //     }
    }
}