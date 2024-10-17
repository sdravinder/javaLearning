package oopsConcepts.innerClassAndNestedClass;

public class InnerClass {

    class Toy{

        int price;
    }

    static class Playstation{

        int price;

    }

    public static void main(String[] args) {
        Toy toy = new InnerClass(). new Toy();
        toy.price = 10;

        InnerClass obj = new InnerClass();
        Toy obj2 = obj.new Toy();
        obj2.price = 20;

        // For Static we don't need to create new object.
        Playstation playstation = new Playstation();
    }
}
