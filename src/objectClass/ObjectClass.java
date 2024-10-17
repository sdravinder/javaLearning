package objectClass;

import java.util.Objects;

class car{
    String model;
    int year;

    public car(String model, int year){
        this.model = model;
        this.year = year;
    }

  /*@Override
    public String toString(){
        return "Car Model" + model + " and year is " + year;
    }*/

    /*public boolean equals(Object obj) {
        Car that = (Car)obj;
        if(this.model.equals(that.model) && this.year == that.year){
            return true;
        }
        return false;
    }*/

    /* @Override
    public int hashCode() {
        int initialNumber = 31;
        initialNumber += year;
        initialNumber += model.hashCode();
        return initialNumber;
    }*/

    @Override
    public String toString() {
        return "car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        car car = (car) o;
        return year == car.year && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }
}

public class ObjectClass {

    public static void main(String[] args) {
        car obj1 = new car("Honda", 2018);
        car obj2 = new car("Honda", 2018);

        //System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
