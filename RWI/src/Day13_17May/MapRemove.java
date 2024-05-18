/*
This method is used in Map Interface to remove the mapping for a key from this map if it is
present in the map.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MapRemove{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Print the map before removing a key
        System.out.println("Map before removal: " + map);

        // Remove a key-value pair from the map
        String removedValue = map.remove("two");

        // Check if the key was present and removed
        if (removedValue != null) {
            System.out.println("Removed key 'two' with value: " + removedValue);
        } else {
            System.out.println("Key 'two' was not found in the map.");
        }

        // Print the map after removing the key
        System.out.println("Map after removal: " + map);

        // Attempt to remove a non-existent key
        String nonExistentRemovedValue = map.remove("four");

        // Check if the key was present and removed
        if (nonExistentRemovedValue != null) {
            System.out.println("Removed key 'four' with value: " + nonExistentRemovedValue);
        } else {
            System.out.println("Key 'four' was not found in the map.");
        }

        // Print the final state of the map
        System.out.println("Final state of the map: " + map);
    }
}
