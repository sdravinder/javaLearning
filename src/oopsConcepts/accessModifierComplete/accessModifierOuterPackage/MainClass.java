package oopsConcepts.accessModifierComplete.accessModifierOuterPackage;

import oopsConcepts.accessModifierComplete.accessModifiers.Teacher;

public class MainClass extends Teacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        //obj.degree = "PHD"; // cannot excess outside the package.

        MainClass mainClass = new MainClass();
        mainClass.studentCount = 100; // As it protected. So, it can be access to subclass of different package.
    }
}
