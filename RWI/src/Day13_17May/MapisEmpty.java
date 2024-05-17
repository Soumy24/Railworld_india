package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MapisEmpty {
    public static void main(String[] args) {
        // Create an empty HashMap
        Map<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the map empty? " + isEmpty); // Should print true

        // Insert a key-value pair into the map
        map.put("Apple", 1);

        // Check if the map is empty again
        isEmpty = map.isEmpty();
        System.out.println("Is the map empty after adding an entry? " + isEmpty); // Should print false

        // Clear the map
        map.clear();

        // Check if the map is empty after clearing
        isEmpty = map.isEmpty();
        System.out.println("Is the map empty after clearing? " + isEmpty); // Should print true
    }
}
