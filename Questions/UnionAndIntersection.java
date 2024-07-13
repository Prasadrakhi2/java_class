import java.util.*;
public class UnionAndIntersection{

    //intersection
    public static void intersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                set.add(arr1[i]);
            }
            i++; j++;
        }

        System.out.println(set);
    }


    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        // O(n+m)
        for(int i=0; i<arr1.length; i++){ //O(n)
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){  //O(m)
            set.add(arr2[j]);
        }

        System.out.println(set);
    }

    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[]= {6,3,9,2,9,4};

        union(arr1, arr2);
        intersection(arr1, arr2);
    }
}