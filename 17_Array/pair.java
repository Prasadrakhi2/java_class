import java.util.*;
public class pair{

    public static void pair(int a[]){
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length; j++){
                System.out.print("(" + a[i] + "," + a[j] + ") ");
            }
            System.out.println();
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
        pair(a);
    }
}