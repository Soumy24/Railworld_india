package Day12_16May;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;

public class SetcontainsAll {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Harry");
        set.add("Ishana");

        // Create a List containing elements to check
        List<String> elementsToCheck = Arrays.asList("Harry", "Ishana");

        // Use the containsAll method to check if the set contains all elements of the list
        if (set.containsAll(elementsToCheck)) {
            System.out.println("The set contains all elements: " + elementsToCheck);
        } else {
            System.out.println("The set does not contain all elements: " + elementsToCheck);
        }

        // Another List containing elements to check
        List<String> anotherElementsToCheck = Arrays.asList("Harry", "Kashvi");

        // Check again with a different list of elements
        if (set.containsAll(anotherElementsToCheck)) {
            System.out.println("The set contains all elements: " + anotherElementsToCheck);
        } else {
            System.out.println("The set does not contain all elements: " + anotherElementsToCheck);
        }
    }
}
