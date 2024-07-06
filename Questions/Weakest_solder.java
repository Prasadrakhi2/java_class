/*
   We are given an m*n matrix of 1's (soldiers) and 0's (civilians). the soldiers are positioned in front of the civilians. that is , all the 1's will appear to the left of the 0's in each row.
   
   A row 'i' is weaker than a row 'j'  if the following is true:-
   * the number of soldiers in row 'i' is less than the number of soldiers in row 'j'.
   * Both rows have the same number of soldiers and i<j.
 */

import java.util.*;
public class Weakest_solder{

    //class of the entites 
    public static class Weak implements Comparable<Weak>{
        int total;  // total value in a row  
        int indx;   //index

        //constructor
        public Weak(int total, int indx){
            this.total = total;
            this.indx = indx;
        }

        @Override
        public int compareTo(Weak w2){
            //if give the value 0 then compir on the base of index
            if(this.total == w2.total){
                return this.indx - w2.indx;
            }
            //return on the base of total
            else{
                return this.total - w2.total;
            }
        }
    }

    public static void main(String args[]){
        int army[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;

        PriorityQueue<Weak> pq = new PriorityQueue<>();

        //enter the values of total count in a row in priority queue
        for(int i=0; i<army.length; i++){
            int total =0;
            for(int j=0; j<army.length; j++){
                total += army[i][j];
            }
            //add the value of row and column in pq
            pq.add(new Weak(total, i));
        }

        //return the values
        for(int i=0; i<k; i++){
            System.out.println("R" + pq.remove().indx);

        }
    }
}