package collection.Set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
        int rollNo;
        String name;

        public Student(int rollno, String name){
                this.rollNo = rollno;
                this.name = name;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Student student = (Student) o;
                return rollNo == student.rollNo;
        }

        @Override
        public int hashCode() {
                return Objects.hash(rollNo);
        }

        @Override
        public String toString() {
                return "Student{" +
                        "rollNo=" + rollNo +
                        ", name='" + name + '\'' +
                        '}';
        }
}

public class TreeSet {

    public static void main(String[] args) {
            Set<Integer> set = new java.util.TreeSet<>();

            Set<Student> set1 = new HashSet<>();

            Student s1 = new Student(1, "John");
            Student s2 = new Student(1, "John");

            System.out.println(s1.equals(s2));

            set1.add(new Student(1,"Sonu"));
            set1.add(new Student(1,"Ram"));
            set1.add(new Student(1,"Ram"));
            set1.add(new Student(2,"Sahib"));
            set1.add(new Student(3,"Sumit"));

            System.out.println(set1);


            // big O(logn)
            set.add(32);
            set.add(2);
            set.add(54);
            set.add(21);
            set.add(65);

            set.add(2);

            // It will change in ascending order.
            // Repeat element will be removed.
            System.out.println(set);

            // Remove
            System.out.println(set.remove(2));

            // Contains
            System.out.println(set.contains(21));

            // To check empty or not
            System.out.println(set.isEmpty());

            // To check size
            System.out.println(set.size());

            // To clear set
            set.clear();
            System.out.println(set);

            Set<String> set3 = new HashSet<>();
            set3.add("Ravinder");
            set3.add("Sahib");
            set3.add("Sumit");
            set3.add("Ashutosh");

    }
}
