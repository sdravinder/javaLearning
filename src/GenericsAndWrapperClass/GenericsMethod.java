package GenericsAndWrapperClass;

public class GenericsMethod {

    public static void main(String[] args) {

        //printData("hello");
        printData(123);

        GenericsMethod obj = new GenericsMethod();
        obj.<String>doubleData("122");
        //OR
        obj.doubleData(123);

        CustomClass custom = new CustomClass();
        obj.doubleData(custom);
    }

    static <E extends Number> void printData(E data){
        System.out.println(data);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }
}

class CustomClass{

}