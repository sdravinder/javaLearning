package loops.forLoop;

import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        // 2 + 4 + 6 + 8
        for (int i = 0; i <= n; i++) {
            //sum = sum + 2*i;
            sum += 2*i;
        }
        System.out.println("Sum is " + sum);
    }
}
