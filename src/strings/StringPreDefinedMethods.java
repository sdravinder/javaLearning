package strings;

public class StringPreDefinedMethods {
    public static void main(String[] args) {

        String name = "   rAVinDER   ";

        // Change to Upper case
        System.out.println(name.toUpperCase());

        // Change to lower case
        System.out.println(name.toLowerCase());

        // Remove all spaces
        System.out.println(name.trim());

        // Word start with
        System.out.println("Carpet".startsWith("Car"));

        // End with
        System.out.println("Carpet".endsWith("pet"));

        // Equals
        System.out.println("Carpet".equals("Carpet"));

        // Char at location
        System.out.println("Carpet".charAt(3));

        // Convert int into String
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println(age * 2);
    //  System.out.println(stringAge * 2); // Error

        System.out.println(age + 2); // 125
        System.out.println(stringAge + 2); // 1232

        String sentence = "I love Java, Java is good language";

        // Replace String
        String newSentence = sentence.replaceAll("Java", "Cpp");

        // Contains String
        System.out.println(sentence.contains("Cpp"));

        // Moving subString out
        System.out.println(new String(sentence.substring(2)));
        System.out.println(newSentence.substring(2,6)); // excluded last char

        // Spiting on bases of space
        String words[] = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // String to characters
        String colour = "Brown";
        char letters[] = colour.toCharArray();
        for (char letter : letters) {
            System.out.println(letter);
        }

        // String in empty
        String animal = "";
        if(animal.isEmpty()) {
            System.out.println("Is Empty");
        }

        // String is Empty even space also included
        String animal1 = "   ";
        if(animal1.isBlank()) {
            System.out.println("Is Blank");
        }
    }
}
