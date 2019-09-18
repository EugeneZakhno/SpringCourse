import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        System.out.println(list1.add(1)); //true
        System.out.println(list1.size()); // 6

        Collection<Integer> list2 = new ArrayList<Integer>();
        System.out.println(list2.size());
        list2.addAll(list1);
        System.out.println(list2 + " " + list2.size());
        //list2.clear(); // Removing all collection
        System.out.println(list2.isEmpty());
        Object[] arr = list2.toArray();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("\nThe size is "+  arr.length);

    }
}
