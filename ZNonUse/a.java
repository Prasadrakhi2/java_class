// Scanner sc = new Scanner(System.in);
// 		int n =sc.nextInt();
// 		for(int i=0; i<n; i++){
// 		    int a = sc.nextInt();
		    
// 		}

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int m = sc.nextInt();
		    
		    System.out.println((w2-w1 >= x1*x2 && w2-w1 <= x2*m)?1:0);
		}

	}
}
