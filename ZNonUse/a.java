// Scanner sc = new Scanner(System.in);
// 		int n =sc.nextInt();
// 		for(int i=0; i<n; i++){
// 		    int a = sc.nextInt();
		    
// 		}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];
            int t_sum = 0;
            int d_sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                t_sum += a[i];
            }
            // Your code goes here
            for(int i=0; i<n; i++){
                if(a[i]>y){
					a[i] = a[i]-y;
				}
				else{
					a[i] = 0;
				}
                d_sum += a[i];
            }
            System.out.println((d_sum+x<t_sum)?"coupon":"no coupon");
        }
    }
}
