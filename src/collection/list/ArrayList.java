package collection.list;

public class ArrayList {
    public static void main(String[] args) {

        java.util.ArrayList<String> studentName = new java.util.ArrayList<>();
        // In starting it will be of size 10.
        studentName.add("Rakesh");
        studentName.add("Sarah");
        studentName.add("James");
        studentName.add("Jack");
        System.out.println(studentName);
        // After 10, size(n) = n + n/2 +1

        // Adding element on Index  bigO(n)
        studentName.add(2,"Ravinder");
        System.out.println(studentName);

        java.util.ArrayList<String> studentName2 = new java.util.ArrayList<>();
        studentName2.add("Sahib");
        studentName2.add("Sumit");

        studentName.addAll(studentName2);
        System.out.println(studentName);

        // Remove element on index bigO(n)
        studentName.remove(1);
        System.out.println(studentName);

        // Remove element with value
        studentName.remove(String.valueOf("Sahib"));
        System.out.println(studentName);

        // Update value
        studentName.set(2,"Ashutosh");
        System.out.println(studentName);

        // Check value T/F
        System.out.println(studentName.contains("Ravinder"));

        //iterate
        for(int i=0; i<studentName.size(); i++){
            System.out.println("The element is " + studentName.get(i));
        }

        /*for(String element: studentName){
            System.out.println("The element is " + studentName.get(element));
        }*/

        // Clear full
        studentName.clear();
        System.out.println(studentName);
    }
}
