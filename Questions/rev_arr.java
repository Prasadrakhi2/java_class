import java.util.*;
public class rev_arr{

    public static void print(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void rev(int a[], int si, int ei){
        while(si<=ei){
            int temp = a[si];
            a[si] = a[ei];
            a[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("enter the element");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        rev(a, 0, n-1);
        print(a);

    }
}