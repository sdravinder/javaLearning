package GenericsAndWrapperClass;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("123");
        Dog<String> d2 = new Dog<>("124");

        // For this will use generics
        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getId());

        ArrayList<Integer> a = new ArrayList<>();

        Cat<Integer, String> c1 = new Cat<>(12, "pop");
    }
}

class Dog<E>{
    E id;
   // V name;

    public Dog(E id){
        this.id = id;
        //this.name = name;

    }

    E getId(){
        return id;
    }
}

class Cat<I, N>{
    I id;
    N name;

    public Cat(I id, N name){
        this.id = id;
        this.name = name;
    }
}