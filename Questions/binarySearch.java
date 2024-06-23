/* Iterative method*/ 
// import java.util.*;
// public class binarySearch{

//     public static int binarysearch(int a[], int si, int ei, int key){
//         while(si <= ei){
//             int mid = (si + ei)/2;
//             if(a[mid] == key){
//                 return mid;
//             }
//             else if(key < a[mid]){
//                 ei = mid-1;
//             }
//             else{
//                 si = mid + 1;
//             }
//         }
//         return -1;
//     }


//     public static void main(String args[]){
//         int a[] = {11,12,13,14,15,16,17};
//         // int key = 11;

//         System.out.println(binarysearch(a, 0,a.length-1, 15));
//     }
// }


/* Recursive method*/
import java.util.*;
public class binarySearch{

    public static int binarysearch(int a[], int si, int ei, int key){

        if(si > ei){
            return -1;
        }

        int mid = (si+ei) / 2;
        if(key == a[mid]){
            return mid;
        }

        else if(key > a[mid]){
           return binarysearch(a, mid+1, ei, key);
        }

        else{
           return binarysearch(a, si, mid-1, key);
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array=");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("enter the element in the array=");

        for(int i=0; i<a.length; i++){
            int num = sc.nextInt();
            a[i] = num;
        }

        Arrays.sort(a);
        
        System.out.println("enter the finding value=");
        int key = sc.nextInt();

        if(binarysearch(a, 0, a.length-1, key) == -1){
            System.out.println("not found");
        }

        else{
            System.out.println(binarysearch(a, 0, a.length-1, key));
        }
    }
}