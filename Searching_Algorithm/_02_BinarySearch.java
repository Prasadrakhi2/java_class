// Binary Search = > divid and concure O(log n)

import java.util.*;
public class _02_BinarySearch{

    //Binary search
    public static int binarySearch(int a[], int si, int ei, int key){
        if(si>=ei){
            return -1;
        }

        while(si<=ei){
            int mid = (si+ei)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(key < a[mid]){
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arr");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter the element in the arr");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        // System.out.println(a);

        System.out.println("enter the founding element=");
        int key = sc.nextInt();

        if(binarySearch(a,0,a.length-1, key) == -1){
            System.out.println("not found");
        }
        else{
            System.out.println(binarySearch(a,0,n-1,key));
        }



    }
}