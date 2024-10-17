package oopsConcepts.abstraction.interfaceConcepts;

class Monkey implements Animal, Pet{

    @Override
    public void eats() {
        System.out.println("Monkey eats");
    }

    public void sings() {
        System.out.println("Monkey sings");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey drinks");
    }
}
