package basics.userInput;

import java.util.Scanner;

public class UserInputAge {
    public static void main(String[] args) {

        // User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);
    }
}

