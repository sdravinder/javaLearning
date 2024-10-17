package oopsConcepts.polymorphismAndJavaMemory;

public class PolymorphismAndJavaMemory {
    public static void main(String[] args) {
        int a= 5;
        Data obj = new Data();
        obj.data = 5;
        changeValue(a, obj);
        System.out.println(a);
        System.out.println(obj.data);

        Data d = new ChildData();
        d.printData();  // runtime polymorphism aka method overriding.

        Data d2 = new Data();
        d2.printData(5); // Compile time polymorphism aka method overloading.

        ChildData d3 = new ChildData();
        d3.insideChildOnly();
    }

    static void changeValue(int a, Data obj){
        a = 10;
        obj.data = 100;
    }
}

class Data{
    int data;

    // compile time
    public void printData(){
        System.out.println(data);
    }
    // compile time
    public void printData(int times){
        for(int i=0;i<times;i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data{

    @Override
    public void printData(){
        System.out.println("Overridden" + data);
    }

    public void insideChildOnly(){
        System.out.println("Inside ChildOnly");
    }
}
