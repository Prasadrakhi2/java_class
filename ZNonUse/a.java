// Scanner sc = new Scanner(System.in);
// 		int n =sc.nextInt();
// 		for(int i=0; i<n; i++){
// 		    int a = sc.nextInt();
		    
// 		}

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc = new Scanner(System.in);
// 		int t = sc.nextInt();
// 		for(int i=0; i<t; i++){
// 		    int x = sc.nextInt();
// 		    int y = sc.nextInt();
		    
		    
// 		    System.out.println(Math.max(((500-(x*2))+(1000-((y+x)*4))), ((1000-(y*4))+(500-((x+y)*2)))));
// 		}

// 	}
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
		int n =sc.nextInt();
		for(int i=0; i<n; i++){
		    int u = sc.nextInt();
		    int v = sc.nextInt();
		    System.out.println((u==v)?1:3);
		}

	}
}
