package oopsConcepts.encapsulation_StaticAndFinalKeyword;

public class Person {

    static int count = 0;

    public static final String scientificname = "Ravinder";

    public Person() {
        count++;
    }

    private int age;
    private String name;

    boolean canBeChanged = true;

    // setter
    public void setAge(int age) {
        if(canBeChanged) {
            if(age > 18) {
                this.age = age;
            }
        }
    }

    boolean canBeAccessed = false;
    // getter
    public int getAge() {
        if (canBeAccessed) {
            return age;
        }
        return -1;
    }

}
