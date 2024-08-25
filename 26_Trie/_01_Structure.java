/*Tries => also known as the prefix tree
 *         it contain the k no of child
 */

import java.util.*;
public class _01_Structure{
    static class Node{
        Node child[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                child[i] = null;
            }
        }
    }

    public static Node root = new Node();

    //insertion  O(L)  = L = length of the word
    public static void insert(String word){ 
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int inx = word.charAt(level)-'a';
            if(curr.child[inx] == null){
                curr.child[inx] = new Node();
            }
            curr = curr.child[inx];
        }
        curr.eow = true;
    }

    //serching  //O(L)
    public static boolean isPresent(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int inx = key.charAt(level)-'a';
            if(curr.child[inx] == null){
                return false;
            }
            curr = curr.child[inx];
        }
        return curr.eow == true;
    }


    public static void main(String args[]){
        String words[] = {"the", "a" ,"there", "their", "any", "them"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(isPresent("there"));
        System.out.println(isPresent("th"));
    }
}