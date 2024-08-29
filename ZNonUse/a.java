// import java.util.*;
// public class a{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();

//         list1.add(1);
//         list1.add(2);
//         list1.add(4);

//         System.out.println(list1);

//         list2.add(1);
//         list2.add(3);
//         list2.add(4);

//         System.out.println(list2);
//         list1.addAll(list2);
//         System.out.println(Collections.sort(list1));

//     }
// }

import java.util.*;
public class a{
    public static void main(String args[]){
        System.out.println("enter the size of the arr");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        System.out.println("enter the elements in the arr");
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i=1; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println("max=" + max);
    }
}