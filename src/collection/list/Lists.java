package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // In starting, it will be of size 10.
        list.add(10); // Is used to add the element.
        list.add(20);
        list.add(30);
        list.add(1);
        // After 10, size(n) = n + n/2 +1

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(list);
        System.out.println(list.size());  // Is used to check the size.
        System.out.println(list.contains(20)); // To check the element if present or not.

        list.remove(Integer.valueOf(10)); // To remove the value.
        list.remove(1);  // To remove the value by element and index.

        list.addAll(list2); // will add complete list 2 in list 1.

        list.removeAll(list2); // will remove the common element.

        list.retainAll(list2); // will remove elements which are not in list 2.

        list.clear(); // will clear all the element for list.

        Object a[] = list.toArray();

        for(Object e: a){
            Integer temp = (Integer) e;
            System.out.println(e);
        }
        System.out.println(list);

        // list functions

        System.out.println(list.get(0)); // Is use to get value o index.

        list.set(1, 200); // Reset the value on index.

        list.add(2, 1000); // Setting value on any index.

        list.remove(1); // remove from list class to remove.

        System.out.println(list.indexOf(2)); // To check what is present on index.
    }
}
