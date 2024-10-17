package oopsConcepts.methodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Ravinder");
        obj.greetings("Ravinder", 5);
    }
}

class Greet {

    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello " + name +", Good Morning");
    }

    // Return do not matter.
    /*int greeting() {
        System.out.println("Hello, Good Night");
    }*/

    // Same type of argument no allowed.
    /*void greetings(String colour) {
        System.out.println("Hello " + colour +", Good Night");
    }*/

    void greetings(String name, int count) {
        for(int i = 1; i < count; i++) {
            System.out.println("Hello " + name +", Good Morning");
        }
    }
}
