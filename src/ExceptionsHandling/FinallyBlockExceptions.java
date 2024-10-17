package ExceptionsHandling;

public class FinallyBlockExceptions {
    public static void main(String[] args) {

        int a[] = new int[5];

        System.out.println("Hello World!");

        //Finally will always be executed
        /*try{
            System.out.println(a[8]);
        }catch(Exception e){
            System.out.println("Exceptions Handled");
        }finally {
            System.out.println("I will run always");
        }*/

        //Finally will always be executed even they are not Exception
        /*try {
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exceptions Handled");
        } finally {
            System.out.println("I will run always");
        }
        }*/

        //Finally will work without catch also
        /*try {
            System.out.println(a[8]);
        } finally {
            System.out.println("I will run always");
        }*/

        //Throws
        try{
            getNumberFromArray(a);
        } catch (Exception e){
            System.out.println("Caught the Exception" + e.getMessage());
        }
        System.out.println("Bye World");
    }

    //Throws -> If we know method can throw exception
    static int getNumberFromArray(int a[]) throws ArithmeticException {
        return a[8];
    }
}
