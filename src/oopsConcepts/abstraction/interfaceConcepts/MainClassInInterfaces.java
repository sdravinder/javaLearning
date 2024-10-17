package oopsConcepts.abstraction.interfaceConcepts;

public class MainClassInInterfaces {
    public static void main(String[] args) {
        // Cannot create object of Interface
        // Animal a1 = new Animal();
        Monkey m1 = new Monkey();
        m1.eats();
        m1.sings();
        m1.drinks();

        System.out.println(Monkey.LEGS);
    }
}


