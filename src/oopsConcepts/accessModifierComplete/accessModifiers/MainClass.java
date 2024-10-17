package oopsConcepts.accessModifierComplete.accessModifiers;

import oopsConcepts.encapsulation_StaticAndFinalKeyword.MainInEncapsulation;

public class MainClass {
    public static void main(String[] args) {
        Teacher obj = new Teacher();

        // Can access teachingClass because it is public.
        obj.teachingClass = 12;

        // Cannot access id because it is Private.
        // obj.id;

        obj.degree = "PHD";

        MainInEncapsulation.printHello();
    }
}
