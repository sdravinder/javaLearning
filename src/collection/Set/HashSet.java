package collection.Set;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        // big O(1)
        Set<Integer> set = new java.util.HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        set.add(2);

        // It can be in any order as it used hash. for example - 32-> asdkjl
        // Repeat element will be removed.
        System.out.println(set);

        // Remove
        System.out.println(set.remove(2));

        // Contains
        System.out.println(set.contains(21));

        // To check empty or not
        System.out.println(set.isEmpty());

        // To check size
        System.out.println(set.size());

        // To clear set
        set.clear();
        System.out.println(set);

    }
}
