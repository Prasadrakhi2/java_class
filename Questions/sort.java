// import java.util.*;
// public class sort{
//     public static void print(int a[]){
//         for(int i=0; i<a.length; i++){
//             System.out.print(a[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void margeSort(int a[], int si, int ei){

//         if(si>=ei){
//             return;
//         }

//         int mid =si+(ei-si)/2;
//         margeSort(a,si,mid);
//         margeSort(a,mid+1,ei);
//         marge(a,si,mid,ei);
//     }

//     public static void marge(int a[], int si, int mid, int ei){
//         int temp[] = new int[ei-si+1];
//         int i=si;
//         int j=mid+1;
//         int k=0;

//         while(i<=mid && j<=ei){
//             if(a[i]<a[j]){
//                 temp[k] = a[i];
//                 i++; k++;
//             }
//             else{
//                 temp[k] = a[j];
//                 j++; k++;
//             }
//         }

//         while(i<=mid){
//             temp[k++] = a[i++];
//         }
//         while(j<=ei){
//             temp[k++] = a[j++];
//         }

//         for(k=0 , i=si; k<temp.length; k++, i++){
//             a[i] = temp[k];
//         }
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         // int a[] = {5,8,2,6,4,3,9,7};
//         System.out.println("Experiment no=03");
//         System.out.println();
//         System.out.println("Rakhi Prasad");
//         System.out.println();
//         System.out.println("0832CS221163");
//         System.out.println();
//         System.out.println("enter the size of the array");
//         int n=sc.nextInt();
//         int a[] = new int[n];
//         System.out.println("enter the values=");
//         for(int i=0; i<a.length; i++){
//             a[i] = sc.nextInt();
//         }
//         System.out.println("array before sorting=");
//         print(a);
//         margeSort(a,0,a.length-1);
//         System.out.println("array after sorting=");
//         print(a);
//     }
// }





//quickSort
// import java.util.*;
// public class sort{

//     public static void print(int arr[]){
//         for(int i=0; i<=arr.length-1; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void quickSort(int arr[], int si, int ei){
//         if(si >= ei){
//             return;
//         }

//         int pind = partition(arr, si, ei);
//         quickSort(arr, si, pind-1); //left ilteration
//         quickSort(arr, pind+1, ei); //right ilteraiton

//     }

//     public static int partition(int arr[], int si, int ei){
//         int pivot = arr[ei];
//         int i = si-1;
//         for(int j=si; j<=ei; j++){
//             if(arr[j] < pivot){
//                 //swap
//                 i++;
//                 int temp = arr[i];
//                 arr[i] =arr[j];
//                 arr[j] = temp;
//             }
//         }
//             //change the index of the position of the pivot
//             i++;
//             int temp = arr[ei];
//             arr[ei] = arr[i];
//             arr[i] = temp;
//             return i;
//     }

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int arr[] = {6,3,-6,8,9,-4,2,5,-2};
//         quickSort(arr, 0, arr.length-1);
//         print(arr);
//     }
// }






/* strassi's Matrix */
import java.util.*;
public class sort{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Experment no = 04");
        System.out.println("RAKHI PRASAD");
        System.out.println("0832CS221163");
        System.out.println();
        System.out.println("enter the size of the array=");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("enter the vlaue in first matrix=");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the vlaue in Secound matrix=");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }

        int P,Q,R,S,T,U,V;
        P = (a[0][0] + a[1][1])*(b[0][0] + b[1][1]);
        Q =  b[0][0]*(a[1][0] + a[1][1]);
        R =  a[0][0]*(b[0][1] - b[1][1]);
        S =  a[1][1]*(b[1][0] - b[0][0]);
        T =  b[1][1]*(a[0][0] + a[0][1]);
        U =  (b[0][0] + b[0][1])*(a[1][0]-a[1][1]);
        V =  (b[1][0] + b[1][1])*(a[0][1]-a[1][1]);

        //System.out.println(P + " " + Q + " " + R + " " + S + " " +T);

        c[0][0] = P+S-T+V;
        c[0][1] = R + T;
        c[1][0] = Q + S;
        c[1][1] = P+R-Q+U;

        System.out.println("resultent matrix =");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println(c[0][0]);
    }
}




