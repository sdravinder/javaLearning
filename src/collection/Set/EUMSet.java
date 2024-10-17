package collection.Set;

import java.util.EnumSet;

public class EUMSet {
    public static void main(String[] args) {
        System.out.println(Colour.GREEN);

        //EnumSet<Colour> eumSet = EnumSet.of(Colour.class);
    }

    enum Colour{
        RED, YELLOW, GREEN
    }
}
