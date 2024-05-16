package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetisEmpty {
    public static void main(String[] args) {
        Set<String> String = new HashSet<>();

        // Checking if the set is empty initially
        System.out.println("Is the set empty? : " + String.isEmpty());  // true

        // Adding an element and checking again
        String.add("John");
        System.out.println("Is the set empty after adding an element? : " + String.isEmpty());  // false

        // Clearing the set and checking again
        String.clear();
        System.out.println("Is the set empty after clearing? : " + String.isEmpty());  // true
    }
}