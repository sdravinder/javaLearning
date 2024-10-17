package ExceptionsHandling;

import java.util.Scanner;

public class CustomExceptions {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");

        try{
        int age = sc.nextInt();
        if (age > 100) {
            throw new MyException("My Error is this");
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String msg){

        super(msg);
    }
}
