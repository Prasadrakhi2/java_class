// Insertion sort => place element at its position
// O(n)
// Collections -> use only in "objects". ex-> Interger


import java.util.*;
public class _03Insertion_Sort{

    //  print fun
       public static  void print(int a[] /* ,  Integer a[] */){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.err.println();
        }

    // insertion sort
    public static void I_sort(int a[]){
        for(int i=1; i<a.length; i++){
            int curr = a[i];
            int prev = i-1;

            while(curr < a[prev] && prev >= 0){
                a[prev + 1] = a[prev];
                prev--;
            }


            // place curr at its position
            a[prev + 1] = curr;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int n = sc.nextInt();
        int a[] = new int[n];
        // Integer a[] = {8,5,2,4,1};
        System.out.println("enter element");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        I_sort(a);
        Arrays.sort(a);
        // Arrays.sort(a,Collections.reverseOrder());
        print(a);
    }
}