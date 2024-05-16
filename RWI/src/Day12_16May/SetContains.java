package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetContains {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Advik");
        set.add("Aahan");

        // Element to check for
        String elementToCheck = "Advik";

        // Use the contains method to check if the set contains the specified element
        if (set.contains(elementToCheck)) {
            System.out.println(elementToCheck + " is in the set.");
        } else {
            System.out.println(elementToCheck + " is not in the set.");
        }

        // Another element to check for
        String anotherElementToCheck = "Arnav";

        // Check again with a different element
        if (set.contains(anotherElementToCheck)) {
            System.out.println(anotherElementToCheck + " is in the set.");
        } else {
            System.out.println(anotherElementToCheck + " is not in the set.");
        }
    }
}

