package loops.forEach;

public class ForEach {
    public static void main(String[] args) {
        String names[] = {"Ram", "Harish", "Karan", "Montly"};

        for(int i = 0; i < names.length; i++) {
            System.out.println("Name is " + names[i]);
        }

        for(String name : names) {
            System.out.println("Name is " + name);
        }
    }
}
