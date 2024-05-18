/*
This method is used in Map Interface to generate ahashCode for the given map containing keys
 and values.
 */
package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MaphashCode {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Get the hash code of the map
        int hashCode = map.hashCode();

        // Print the hash code
        System.out.println("The hash code of the map is: " + hashCode);

        // Modify the map and get the new hash code
        map.put("four", "4");
        int newHashCode = map.hashCode();

        // Print the new hash code
        System.out.println("The new hash code of the map after modification is: " + newHashCode);
    }
}
