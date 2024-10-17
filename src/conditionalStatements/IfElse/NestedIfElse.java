package conditionalStatements.IfElse;

public class NestedIfElse {
    public static void main(String[] args) {

        // You are given three numbers, find the maximum number
        int a = 4;
        int b = 5;
        int c = 1;

        if(a > b){
                System.out.println("A is bigger than B");
            if(a > c){
                System.out.println("A is bigger than C");
                System.out.println("A is Largest " + a);
        } else {
                System.out.println("C is bigger than A");
                System.out.println("C is Largest " + c);
            }
        } else{
                System.out.println("B is Largest than A");
            if(b > c) {
                System.out.println("B is bigger tha C");
                System.out.println("B is Largest " + b);
            } else {
                System.out.println("C is bigger than B");
                System.out.println("C is Largest " + c);
            }
        }

        // By ternary Operator
        int a1 = 26;
        int b1 = 23;
        int c1 = 123;

        int max = a1 > b1 ? a1 > c1 ? a1 : c1 : b1 > c1 ? b1 : c1;
        System.out.println("Value of max is " + max);
    }
}
