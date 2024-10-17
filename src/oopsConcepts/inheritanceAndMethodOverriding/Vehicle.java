package oopsConcepts.inheritanceAndMethodOverriding;

// If class is final it cannot be extended.
//final public class Vehicle {
public class Vehicle {
    int gears;
    final int speed = 120;

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(2);
        v1.gears = 6;
        // Final value cannot be modified
        // v1.speed =150;
    }

    int wheelsCount;
    public String model;

    Vehicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating a vehicle with wheels " + wheelsCount);
    }

    void start(){
        System.out.println("Vehicle is Starting");
    }

    final void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
}
