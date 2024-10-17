package strings;

import java.util.Scanner;

public class combiningStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = sc.nextLine();

        System.out.println("Enter your Last Name");
        String lastName = sc.nextLine();

        System.out.println("Your Full Name: " + firstName + " " + lastName);
    }
}
