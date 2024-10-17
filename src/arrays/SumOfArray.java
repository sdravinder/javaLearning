package arrays;

public class SumOfArray {
    public static void main(String[] args) {

        int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};

        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }

        System.out.println("Sum is " + sum);
    }
}
