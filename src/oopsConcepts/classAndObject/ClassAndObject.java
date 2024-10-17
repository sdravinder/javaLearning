package oopsConcepts.classAndObject;

public class ClassAndObject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Tommy";
        dog1.bark();
        dog1.walk();

        Dog dog2 = new Dog();
        dog2.name = "Jack";
        dog2.bark();
        dog2.walk();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 5;
        num1.print();
    }
}

class Dog{
    String name;
    int age;
    String colour;

    void walk(){
        System.out.println(name + " is walk");
    }

    void bark() {
        System.out.println(name + " is bark");
    }
}

class Complex{
    int a, b;

    void print(){
        System.out.println(a+ " + " + b + "i");
    }
}

