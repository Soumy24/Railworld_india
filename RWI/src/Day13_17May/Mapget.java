/*
This method is used to retrieve or fetch the value mapped by a particular key mentioned in
the parameter. It returns NULL when the map contains no such mapping for the key.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class Mapget {
    public static void main(String[] args) {
        // Create a HashMap and populate it with some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Kunal", 1);
        map.put("Madhav", 2);
        map.put("Nihal", 3);

        // Use the get() method to retrieve values associated with keys
        Integer appleValue = map.get("Kunal");
        Integer bananaValue = map.get("Madhav");
        Integer grapeValue = map.get("Param");  // Key not present in the map

        // Print the retrieved values
        System.out.println("Value associated with key 'Kunal': " + appleValue);
        System.out.println("Value associated with key 'Madhav': " + bananaValue);
        System.out.println("Value associated with key 'Param': " + grapeValue);  // Should print null
    }
}
