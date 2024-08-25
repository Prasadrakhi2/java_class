import java.util.*;
public class a{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(4);

        System.out.println(list1);

        list2.add(1);
        list2.add(3);
        list2.add(4);

        System.out.println(list2);
        list1.addAll(list2);
        System.out.println(Collections.sort(list1));

    }
}