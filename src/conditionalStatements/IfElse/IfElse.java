package conditionalStatements.IfElse;

public class IfElse {
    public static void main(String[] args) {

        // Voting If-Else
        int age = 24;
        if (age >= 18) {
            System.out.println("You can vote");
        }else {
            System.out.println("You cannot vote");
        }

        // Office If-Else
        int day = 5;
        if (day == 1) {
            System.out.println("Go to Home");
        }else{
            System.out.println("Go to Office");
        }
    }
}
