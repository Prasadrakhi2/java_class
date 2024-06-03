import java.util.*;
public class Inverted_Star{

    public static void invertedStar(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of n=");
        int n = sc.nextInt();

        invertedStar(n);

    }
}