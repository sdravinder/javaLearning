package basics.operators;

public class OtherOperators {
    public static void main(String[] args) {

        // Other Operator
        // Increment/ Decrement Operators
        int a = 12;
        a = a + 1; // 13

        // Increment Operator
        a++; // 14
        System.out.println(a);

        // Decrement Operator
        a --;
        System.out.println(a);

        // Ternary Operators
        int b = 12;
        int c = 23;
        int max = 0;

        if (b > c) {
            max = b;
        } else{
            max = c;
        }

        max = a > b ? a : b;
    }
}
