/*
This method is used to return the number of key/value pairs available in the map.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MapSize {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Get the size of the map
        int size = map.size();

        // Print the size of the map
        System.out.println("The size of the map is: " + size);

        // Remove a key-value pair from the map
        map.remove("two");

        // Get the new size of the map
        int newSize = map.size();

        // Print the new size of the map
        System.out.println("The size of the map after removal is: " + newSize);
    }
}
