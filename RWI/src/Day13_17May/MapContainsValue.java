/*
This method is used in Map Interface to check whether a particular value is being mapped by a
single or more than one key in the Map. It takes the value as a parameter and returns  True
 if that value is mapped by any of the keys in the map.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MapContainsValue {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Value to be checked
        String value = "2";

        // Check if the value is present in the map
        if (map.containsValue(value)) {
            System.out.println("The map contains the value: " + value);
        } else {
            System.out.println("The map does not contain the value: " + value);
        }

        // Checking another value
        String anotherValue = "4";
        if (map.containsValue(anotherValue)) {
            System.out.println("The map contains the value: " + anotherValue);
        } else {
            System.out.println("The map does not contain the value: " + anotherValue);
        }
    }
}
