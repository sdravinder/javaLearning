package collection.stack;

import java.util.ArrayDeque;

public class Stack {
    public static void main(String[] args) {

        ArrayDeque<String> animals = new ArrayDeque<>();

        // Putting element in Stack
        animals.push("Lion");  // To add an element.
        animals.push("Cat");
        animals.push("Horse");
        animals.add("Dog");
        System.out.println("Stack" + animals);


        System.out.println(animals.peek()); // Element on top


        animals.pop();  // Removing top element
        System.out.println("Stack" + animals);


    }
}
