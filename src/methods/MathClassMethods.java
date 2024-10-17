package methods;

public class MathClassMethods {
    public static void main(String[] args) {

        int a = 4;
        int b = 7;

        System.out.println(Math.min(a, b));   // Use to find minimum
        System.out.println(Math.max(a, b));   // Use to find maximum
        System.out.println(Math.sqrt(16));    // Use to find Square
        System.out.println(Math.pow(3 , 4));  // Use to find Power
        System.out.println(Math.abs(-4));     // Use to convert negative to positive
        System.out.println(Math.random());    // Use to give any random value from 1 to 10
        System.out.println(getRandomNumber(10, 20));
        System.out.println(Math.ceil(5.1));   // Use to display ceil
        System.out.println(Math.floor(5.9));  // Use to display floor
        System.out.println(Math.round(5.8));  // Use to round the number
    }

    public static int getRandomNumber(int a, int b){
    //  return (int) (Math.random() * 6) + 1;
        return (int) (Math.random() * (b - a + 1) + a);
    }
}
