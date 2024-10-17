package oopsConcepts.inheritanceAndMethodOverriding;

public class Car extends Vehicle{

    String color;

    // Cannot be used as it is Final method
    /*void accelerate(){
        System.out.println("Car accelerate");
    }*/

    // Method Overriding
    void start(){

        Scooter scooterObj = new Scooter();
        scooterObj.braking(this);

        super.start();
        System.out.println(this);
        System.out.println(this.model + " Car is Starting");
    }

    Car()
    {
        // Calling Parent Constructor
        super(2 );
        System.out.println("Car is being created");
    }

    public static void main(String[] args) {
        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "Red";
        obj.start();
        System.out.println(obj.wheelsCount);
        obj.accelerate();
    }
}
