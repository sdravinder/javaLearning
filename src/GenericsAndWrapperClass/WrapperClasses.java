package GenericsAndWrapperClass;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {

        Integer obj1 = new Integer(12);
        // OR
        Integer obj2 = Integer.valueOf(12); // Most recommended
        // OR
        Integer obj3 = 12; // autoboxing  // Most recommended

        System.out.println(obj2 * 4);

        boolean myBoolean = Boolean.valueOf(false);

        int age = obj1; // unboxing

        // Not allow as int is primary data type.
        //ArrayList<int> a = new ArrayList<int>();

        ArrayList<Integer> a = new ArrayList<>();

    }
}
