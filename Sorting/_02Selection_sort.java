// find 'min' place at their position

import java.util.*;
public class _02Selection_sort{


       // print fun
       public static  void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.err.println();
        }


        //selection sort
        public static void s_sort(int a[]){
            for(int i=0; i<a.length; i++){
                int min = i;
                for(int j=i+1; j<a.length; j++){
                    if(a[j]<a[min]){
                        min = j;
                    }
                }
                // swap
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter element");
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        s_sort(a);
        print(a);
    }
}