/*
This method is used in Map Interface to return a Set view of the keys contained in this map.
The set is backed by the map, so changes to the map are reflected in the set, and vice-versa.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapkeySet {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Get the set of keys from the map
        Set<String> keys = map.keySet();

        // Print the keys
        System.out.println("The keys in the map are: " + keys);

        // Iterate through the keys and print each one
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}


