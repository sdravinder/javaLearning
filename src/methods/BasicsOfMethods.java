package methods;

public class BasicsOfMethods {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        greet();
        System.out.println(3);
        System.out.println(4);

        average(4,6);
        average(2,7);

        for(String arg: args) {
            System.out.println(arg);
        }

        int averageFromFunction = average1(4,6);
        int douubleOfAvg = 2 * averageFromFunction;
        System.out.println(douubleOfAvg);
        int averageFromAverage3 = average3( 1,3, false);
        System.out.println(averageFromAverage3);
    }

    // Method without return
    public static void greet(){
        System.out.println(5);
        System.out.println("Hello World");
        System.out.println(6);
    }

    // Method of Average number without return
    public static void average(int a, int b){
        int avg = (a+b)/2;
        System.out.println("The Average is " + avg);
    }

    // Method of Average number with return
    public static int average1(int a, int b){
        int avg = (a+b)/2;
        return avg;
    }

    // Method of Average number with return having code after return
    public static int average3(int a, int b, boolean shouldAverage){
        if(shouldAverage == false){
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("Returning he avg");
        return avg;
    }
}
