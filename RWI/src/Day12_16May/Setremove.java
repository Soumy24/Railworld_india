package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class Setremove {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Manvik");
        set.add("Myra");
        set.add("Aarna");

        // Print the set before removal
        System.out.println("Set before removal: " + set);

        // Remove an element from the set
        boolean isRemoved = set.remove("Myra");

        // Check if removal was successful
        if (isRemoved) {
            System.out.println("Element 'Myra' removed successfully.");
        } else {
            System.out.println("Element 'Myra' not found in the set.");
        }

        // Print the set after removal
        System.out.println("Set after removal: " + set);
    }
}
