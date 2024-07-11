/* */

import java.util.*;
public class Valid_Anagram{
    public static void main(String args[]){
        Character s[] = {'k','n','e','e'};
        Character t[] = {'k','e','e','n'};

        //enter the value in map
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length; i++){
            if(map.containsKey(s[i])){
                map.put(s[i],map.get(s[i])+1);
            }
            else{
                map.put(s[i],1);
            }
        }

        System.out.println(map);

        //check
        for(int i=0; i<t.length; i++){
            if(map.containsKey(t[i])){
                
                if(map.get(t[i]) <=1){
                    map.remove(t[i]);
                }
                else{
                    map.put(t[i],map.get(t[i])-1);
                }
                System.out.println(map);
            }
            
            else{
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}



import java.util.*;
public class Valid_Anagram{

    public static boolean isvalidAngram(String s, String t){
        HashMap<Character,Integer> map = new HashMap<>();

        //store
        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        //check
        for(int i=0; i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i)) <=1){
                    map.remove(t.charAt(i));
                }
                else{
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }
                System.out.println(map);
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s ="race";
        String t ="chre";

        System.out.println(isvalidAngram(s, t));

    }
}
