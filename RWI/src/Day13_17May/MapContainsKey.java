/*
This method is used in Map Interface in Java to check whether a particular key is being
mapped into the Map or not. It  takes the key element as a parameter and returns True if
that element is mapped in the map.
 */

package Day13_17May;

import java.util.HashMap;
import java.util.Map;

public class MapContainsKey{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, String> map = new HashMap<>();

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");

        // Key to be checked
        String key = "two";

        // Check if the key is present in the map
        if (map.containsKey(key)) {
            System.out.println("The map contains the key: " + key);
        } else {
            System.out.println("The map does not contain the key: " + key);
        }

        // Checking another key
        String anotherKey = "four";
        if (map.containsKey(anotherKey)) {
            System.out.println("The map contains the key: " + anotherKey);
        } else {
            System.out.println("The map does not contain the key: " + anotherKey);
        }
    }
}
