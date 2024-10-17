package oopsConcepts;

public class MainClass {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.age =25;
        p1.name = "Ravinder";

        Person p2 = new Person();
        p2.age =25;
        p2.name = "Ashutosh";

        Person p3 = new Person(29, "Sahib Singh");

        Developer d1= new Developer(24, "Singh");

        System.out.println("Name is " + p1.name + " age is " + p1.age);
        System.out.println("Name is " + p2.name + " age is " + p2.age);
        System.out.println("Name is " + p3.name + " age is " + p3.age);
        System.out.println("Name is " + d1.name + " age is " + d1.age);
        p1.eat();
        p2.walk();
        p1.walk(24);
        d1.walk();
        d1.walk(25);

       /* EncapsulationIntro obj = new EncapsulationIntro();
        obj.dowork();*/
    }
}

class Person {
    String name;
    int age;

    static int count = 0;

    public Person() {
        count++;
        System.out.println("Creating an object of Person");
    }

    public Person(int age, String name) {
        this();
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(name + " is eating");
    }

    void walk(int steps){
        System.out.println("name" + " walked " + steps);
    }
}

class Developer extends Person {

    public Developer(int age, String name){
        super(age, name);
    }

    void walk(){
        System.out.println(name + " is walking");
    }
}
