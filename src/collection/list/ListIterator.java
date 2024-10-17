package collection.list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class ListIterator {
    public static  void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        //List<String> fruits = new LinkedList<>(); //add, get
        //List<String> fruits = new Vector<>(); //add, get
        //List<String> fruits = new Stack<>(); //push, pop, peek - to check a top element.

        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Mango");
        fruits.add("Apple");

        for(int i=0; i<fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        for(String fruit : fruits){
            System.out.println("For each fruit" + fruits);
        }

        Iterator<String> fe = fruits.iterator();
        while(fe.hasNext()){
            System.out.println("Iterator" + fe.next());
        }

        List<String> smallList = fruits.subList(1, 3); // Is use to take out small list from a list.
        System.out.println(smallList);
    }
}
