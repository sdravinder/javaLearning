package oopsConcepts.encapsulation_StaticAndFinalKeyword;

public class MainInEncapsulation {

    public static void printHello(){
        System.out.println("Hello World");
        // Not allowed as it's not static method.
        //printHi();
    }

    public void printHi(){
        System.out.println("Hi");
        printHello();
    }

    static {
        System.out.println(" From the static block");
    }

    public static void main(String[] args) {

        System.out.println("From the main method");

        printHello();

        // Not allowed as it is not static and public we need to crete object first.
        //printHi();

        Person p1 = new Person();
        p1.setAge(-12);
        //p1.count = 50;
        //OR
        //Person.count = 50;

        System.out.println(p1.count);

        System.out.println(p1.getAge());

        Person p2 = new Person();
        System.out.println(Person.count);

        //max is a Static variable in Math class.
        System.out.println(Math.max(3,6));

        System.out.println(Person.count);

        // It's final cannot be changed
        //Person.scientificname = "Sonu";
        System.out.println(Person.scientificname);
    }

    static {
        System.out.println(" From the static block 2");
    }

}
