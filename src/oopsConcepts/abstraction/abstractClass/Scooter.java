package oopsConcepts.abstraction.abstractClass;

class Scooter extends Vehicle {

    @Override
    void accelerate() {
        System.out.println("Scooter accelerate");
    }

    @Override
    int brake(int wheels) {
        return 0;
    }
}
