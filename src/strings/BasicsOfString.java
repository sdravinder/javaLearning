package strings;

public class BasicsOfString {
    public static void main(String[] args) {
        String name = "Ravinder";
        String sameName = "Ravinder";
        String newName = new String("Ravinder");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(newName);

        System.out.println("Ravinder Singh");

        // Comparation of Stings

        if (name == sameName){
            System.out.println("Both are same");
        }

        if (name == newName){
            System.out.println("Both are same");
        } else {
            System.out.println("Both are not same");
        }

        // Comparing String value
        if(name.equals(newName)){
            System.out.println("Name and New Names are equal");
        }

        if(name.equalsIgnoreCase(newName)){
            System.out.println("Name and New Names are equal");
        }
    }
}
