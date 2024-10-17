package collection.maps;

import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {

        Animal a1 = new Animal(4, "Leo",10);
        Animal a2 = new Animal(2, "Bruno",4);
        Animal a3 = new Animal(1, "Maxo",6);
        Animal a4 = new Animal(3, "Don",3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        //dogs.sort();
        Collections.sort(dogs);

        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        });

        System.out.println(dogs); // Sorted.

        int a[][] = {
                {4, 5, 2},
                {5, 1, 2},
                {1, 4, 7}
        };

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });

        Arrays.sort(a, (arr1, arr2) -> {
            return arr1[0]- arr2[0];
        });

        for(int e[]:a) {
            for(int element: e) {
                System.out.print(element + " ");
            }
        }


    }
}
