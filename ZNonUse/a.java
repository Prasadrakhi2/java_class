import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static boolean is(int n , int x, int a[]){
		for(int i=0; i<n; i++){
			if(a[i]==x){
				return true;
			}
		}
		return false;
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++){
		    a[i] = sc.nextInt();
		}
		
		    System.out.println((is(n,x,a)==true)? "yes":"no");
		

	}
}
