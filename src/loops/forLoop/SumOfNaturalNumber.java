package loops.forLoop;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;
        // 1 + 2 + 3 + 4 + 5 = 15
        for(int i =1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
    }
}
