// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// for(int i=0; i<t; i++){
//     int h = sc.nextInt();
//     int x = sc.nextInt();
//     int y = sc.nextInt();
// }


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
		    
		    System.out.println((w2-w1 >= x1*x2 && w2-w1 <=x2*m && (x2*m)%(w2-w1)==0)?1:0);
            
		    
		}


	}
}
