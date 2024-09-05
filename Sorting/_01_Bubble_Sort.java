
import java.util.*;
public class _01_Bubble_Sort{

    // print fun
    public static  void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.err.println();
    }

    // bubble sort
    public static void bubbleSort(int a[]){
        
        for(int i=0; i<a.length-1; i++){
            boolean is = false;
            for(int j=0; j<a.length-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    is = true;
                }
            }
            if(is == false){
                    break;
                }
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

        bubbleSort(a);
        print(a);

    }
}