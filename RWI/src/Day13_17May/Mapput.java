package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class Mapput {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Insert key-value pairs into the map using the put() method
        map.put("Prateek", 1);
        map.put("Ridhaan", 2);
        map.put("Shlok", 3);

        // Print the map contents
        System.out.println("Original map: " + map);

        // Update the value associated with the key "Banana"
        map.put("Sujal", 4);

        // Add a new key-value pair
        map.put("Tarun", 5);

        // Print the map contents after updates
        System.out.println("Updated map: " + map);
    }
}
