package basics.operators;

public class AssignmentOperators {
    public static void main(String[] args) {

        //Assignment Operators
        // =
        int a = 12;

        // +=, -=, *=, /=, *=
        int b = 0;
        b += 12;
        System.out.println(b);

        int c = 0;
        c -= a;
        System.out.println(c);

        int d = 0;
        d *= a;
        System.out.println(d);

        int e = 0;
        e /= a;
        System.out.println(e);

        int f = 0;
        f %= a;
        System.out.println(f);
    }
}
