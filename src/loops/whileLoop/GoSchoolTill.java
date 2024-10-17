package loops.whileLoop;

import java.util.Scanner;

public class GoSchoolTill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while(!hasLearnt) {
            System.out.println("Went to school, tried to learn");
            System.out.println("Have you understood : ");
            hasLearnt = sc.nextBoolean();
        }
    }
}
