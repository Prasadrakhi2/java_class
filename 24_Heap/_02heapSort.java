import java.util.*;
public class _02heapSort{

    //heapify function
    public static void heapify(int arr[], int i, int size){   //i = root node
        int left = 2*i+1; //left child
        int right = 2*i+2; //right child

        int maxid = i; //maximum index 

        if(left < size && arr[i] < arr[left]){
            maxid = left;
        }

        if(right <size && arr[maxid] < arr[right]){
            maxid = right;
        }

        //if root is not maximum
        if(maxid != i){
            //swap
            int temp = arr[i];
            arr[i] = arr[maxid];
            arr[maxid] = temp;
        }
    }

    //heap sort
    public static void heapsort(int arr[]){

        //1. build the max heap
        int n = arr.length;
        for(int i=n/2; i>=0; i--){
            heapify(arr , i , n);
        }

        //2. swap the last element with the first
        for(int i = n-1; i>=1 ; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String args[]){
        int arr[] = {5,3,4,2,1};
        heapsort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}