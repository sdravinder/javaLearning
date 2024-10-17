package arrays;

public class SmallestNumberInArray {
    public static void main(String[] args) {
        int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};

        int min = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Minimum is " + min);
    }
}
