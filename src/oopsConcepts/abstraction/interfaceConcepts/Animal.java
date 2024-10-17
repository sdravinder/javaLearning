package oopsConcepts.abstraction.interfaceConcepts;

interface Animal {

    //public static final int LEGS = 4;
    //OR
    int LEGS = 4; // By default, it will be public static final

    void eats(); // abstract method

    void drinks(); // abstract method

    //We can create default method in interface, which we don't need to implement in implement class.
    default void walk(){
        System.out.println("I'm walking");
    }

}
