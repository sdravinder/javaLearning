package basics.userInput;

import java.util.Scanner;

public class UserInputCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long firstNumber = sc.nextLong();
        long secondNumber = sc.nextLong();

        float result = (firstNumber + secondNumber);
        System.out.println(result);
        sc.close();

    }
}
