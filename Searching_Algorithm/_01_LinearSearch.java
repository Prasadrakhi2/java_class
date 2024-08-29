// compair all the elements and the print the desire index
// O(n)

import java.util.*;
public class _01_LinearSearch{
    // linear Search
    public static int LinearSearch(int a[], int key){
        for(int i=0; i<a.length; i++){
            if(a[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();  //size of the array

        int a[] = new int[n];
        //enter the elements in the array
        System.out.println("enter the element in array");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("enter the finding element");
        int key = sc.nextInt(); //finding element
        
        if(LinearSearch(a, key) == -1){
            System.out.println("element not found");
        }

        else{
            System.out.println("index of the element=" + LinearSearch(a, key));
        }

    }
}