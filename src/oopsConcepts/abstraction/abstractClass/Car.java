package oopsConcepts.abstraction.abstractClass;

// The class extending abstract class should define all the methods in abstract class.
class Car extends Vehicle {

    void accelerate() {
        System.out.println("Car accelerate");
    }

    int brake(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks(){
        System.out.println("Car is honked");
    }
}
