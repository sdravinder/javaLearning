package arrays;

public class Multi_DimensionalArray {
    public static void main(String[] args) {
        int marks[][] = new int[4][3];

    //  row -> Student Roll Number
    //  column -> Subject Position

        marks[0][0] = 12;
        marks[0][1] = 98;
        marks[0][2] = 34;

        marks[1][0] = 12;
        marks[1][1] = 67;
        marks[1][2] = 87;

        marks[2][0] = 12;
        marks[2][1] = 67;
        marks[2][2] = 87;

        marks[3][0] = 12;
        marks[3][1] = 98;
        marks[3][2] = 36;

        System.out.println(marks[2][0]);

    //  OR

        int marks1[][] ={
                {12, 98, 34},
                {12, 67, 87},
                {12, 98, 23},
                {14, 67, 36}
                };

        System.out.println(marks1[2][1]);
        System.out.println(marks1[2][2]);
    //  System.out.println(marks1[1][3]);  // ArrayIndexOutOfBound


    }
}
