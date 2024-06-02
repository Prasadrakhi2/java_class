/* 1. use for iterate in the arrays and the array list 
   2. syntex-> for(type name : name of array){  }
 */

import java.util.*;
public class ForEach{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //for each loop for array
        int a[] = {1,2,3,4,5,6};
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();


        //for each loop for arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}