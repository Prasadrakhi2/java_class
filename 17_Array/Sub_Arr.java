import java.util.*;
public class Sub_Arr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size=");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter element");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("sub Arr");
        for(int i=0; i<a.length; i++){
            for(int j=i; j<a.length; j++){
                for(int k=i ; k<=j; k++){
                    System.out.print(a[k] + " ");
                }
                System.err.print(" ");
            }
            System.err.println();
        }
    }
}