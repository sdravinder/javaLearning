package collection.maps;

import java.util.*;


public class Maps {
    public static void main(String[] args) {

        //List<Integer> list = new ArrayList<Integer>();

        Map<String, String> map = new HashMap();
        map.put("US", "United States");
        map.put("IN", "India");
        map.put("IN", "India");    // Will upload but no change.
        map.put("EN", "India");
        map.put("IN", "India2");  // IN value will be replayed.

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        System.out.println(map);

        map.remove("EN");  // Remove.

        System.out.println(map);

        System.out.println(map.containsKey("US"));  // To check if a Key is there or not.
        System.out.println(map.containsValue("United States")); // To check if a Value is there or not.

        System.out.println(map.get("EN"));  // Will give the value of key.

        System.out.println(map.getOrDefault("PN","Others")); // will check for PN else will return default value than is Others.

       map.remove("US"); // Will remove US.

       map.remove("IN","India2"); // Will check if IN contain India2 then will remove it else not.

       Set<String> Keys = map.keySet(); // Will return the set of all keys.
        // OR
       ArrayList<String> Keys1 = new ArrayList<>(map.keySet());

       Collection<String> values = map.values(); // Will return the Collection of all value.
        // OR
        ArrayList<String> values1 = new ArrayList<>(map.values());
    }
}
