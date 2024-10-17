package ExceptionsHandling;

public class MainClass {
    public static void main(String[] args) {

        int a[] = new int[5];

        System.out.println("Hello guys");

        //System.out.println(a[8]); // ArrayIndexOutOfBoundsException, Run - time.

      //System.out.println("Hello guys") // ; expected   compile time error.

        System.out.println("Good Morning,Hello guys");

        System.out.println("Good Afternoon,Hello guys");

        // Try - catch
        /*try {
            System.out.println(a[8]);

            int result = 5/0; // It will be ignored

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to access the out of bound element");
        }catch (ArithmeticException e){
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }*/

        // All multiple Exceptions
        /*try {
            System.out.println(a[8]);

            int result = 5/0; // It will be ignored

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e ){
            System.out.println("Handling the exception");
        }*/

        // Directly Handling by Parent class
        // Inheritance
        // Exception -> RuntimeException -> IndexOutOfBoundsExceptions, ArithmeticException, NullPointException
        try{
            System.out.println(a[8]);

            int result = 5/0; // It will be ignored
        }catch(Exception e){
            System.out.println("All Exception caught");
        }
        System.out.println("Byee guys");
    }
}
