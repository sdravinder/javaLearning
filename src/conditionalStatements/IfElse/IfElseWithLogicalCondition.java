package conditionalStatements.IfElse;

public class IfElseWithLogicalCondition {
    public static void main(String[] args) {

        int time = 11;
        if (time >= 10 && time <= 20) {
            System.out.println("Office is open");
        } else {
            System.out.println("Office is closed");
        }
        if (time == 12 && time == 18) {
            System.out.println("Time for Snacks");
        } else{
            System.out.println("Time for Work");
        }
    }
}
