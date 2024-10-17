package oopsConcepts.abstraction.abstractClass;

public class MainClassOfAbstract {
    public static void main(String[] args) {
        // We cannot create object of abstract class.
        //Vehicle v1 = new Vehicle();

        Car c1 = new Car();
        c1.accelerate();
        c1.brake(4);
        c1.honks();
    }
}


