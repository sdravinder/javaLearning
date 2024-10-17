package oopsConcepts.anonymousClass;

public class AnonymousClass {

    //Anonymous Class -> Can be used once's.
    OuterClass obj = new OuterClass(){

        void sing(){
            System.out.println("Inside Anonymous Class");
        }

        public void outerMethod(){
            System.out.println("Inside Anonymous Class");
        }
    };

    SuperInterface obj2 = new SuperInterface() {

        void sing() {
            System.out.println("Inside Anonymous Class");
        }

        // Is mandatory to define body to interface methods.
        public void interfaceMethod() {
            System.out.println("Inside Anonymous Class");
        }
    };

    SuperInterface obj3 = () -> {

    };

    public static void main(String[] args) {

        Walkable obj4 = (int steps) -> {
            System.out.println("Walked" + steps + "Steps");
            return steps;
        };
        obj4.walk(5);

        Walkable obj5 = (int steps) -> 2 * steps;

        System.out.println(obj5.walk(8));

    }
}

class OuterClass {

    public void outerMethod() {
        System.out.println("Inside OuterClass Class");
    }
}

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();

    // Cannot create more than one method in FunctionalInterface.
    //int walk();
}

interface Walkable{

    int walk(int steps);
}
