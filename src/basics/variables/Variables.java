package basics.variables;

public class Variables {

    public static void main(String[] args) {

        //Boolean
        boolean isPassed = true;
        System.out.println(isPassed);

        //Int
        int count = 12;
        System.out.println(count);

        //Byte
        byte marks =13;
        System.out.println(marks);

        //Short
        short studentCount = 1235;
        System.out.println(studentCount);

        //Float
        float pi = 3.1445679888845f;
        System.out.println(pi);

        //Double
        double pi2 = 3.14144567988845;
        System.out.println(pi2);

        //Chart
        char myLetter = 'A';
        System.out.println(myLetter);

        // Data type Implicit Conversion Direct
        int count1 = 12;
        int count1Int = count;
        System.out.println(count1);

     // Invalid Data type Implicit Conversion
     // int count2 = 12;
     // short count2Short = count2;

        // Explicit (forcing Lost of Data type Conversion )
        int count3 = 130;
        byte count3Short = (byte) count;
        System.out.println(count3);

    }
}
