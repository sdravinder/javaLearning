package oopsConcepts.accessModifierComplete.accessModifiers;

public class Teacher {

    public int teachingClass;

    private int id;

    String degree;  // default or package-private.

    protected int studentCount;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }
}

