import java.util.*;
public class _02Arithmetic_Operation{

    public static int sum(int a, int b){
        return a+b;
    }

    public static int product(int a, int b){
        return a*b;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b=");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("sum of two no = " + sum(a,b));
        System.out.println("product of two no= " + product(a,b));
    }
}