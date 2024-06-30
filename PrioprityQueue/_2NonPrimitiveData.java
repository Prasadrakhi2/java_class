/*Non primitive -> objects */

import java.util.*;
public class _2NonPrimitiveData{

    //make the new object -> we give that to whose base priority it return the value
    //we implement compair interface
    public static class Student implements Comparable<Student>  //Override
    {
        String name;
        int rank;

        //constructor
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;    //it compare the 1st and 2nd value if +VE 1at is large if -VE 2nd is large
        }
    }


    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>(); //assending order
        
        // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder()); // decending order

        pq.add(new Student("A" , 5));
        pq.add(new Student("B" , 3));
        pq.add(new Student("C" , 1));
        pq.add(new Student("D" , 4));
        pq.add(new Student("E" , 2));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> " + pq.peek().rank);
            pq.remove();
        }
        
    }
}