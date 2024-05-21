package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet object to store strings
        Set<String> names = new HashSet<>();

        // Adding elements to the set
        names.add("Purva");
        names.add("Nayan");
        names.add("Amar");

        // Adding a duplicate element
        names.add("Purva");

        // Displaying the set
        System.out.println("Names: " + names);

        // Iterate over the set
        System.out.println("Iterating over the set:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
