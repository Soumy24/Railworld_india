/*
This method is used in Map Interface in Java to create a set out of the same elements
contained in the map. It basically returns a set  view of the map or we can create a new set
and store the map elements into them.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapentrySet {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Abhik", 1);
        map.put("Chirag", 2);
        map.put("Darshit", 3);

        // Get the entry set
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        // Iterate through the entry set and print each entry
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
