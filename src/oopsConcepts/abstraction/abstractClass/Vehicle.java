package oopsConcepts.abstraction.abstractClass;

abstract class Vehicle {

    abstract void accelerate();
    abstract int brake(int wheels);

    void honks(){
        System.out.println("Vehicle is honked");
    }
}
