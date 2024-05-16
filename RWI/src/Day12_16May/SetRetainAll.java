package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetRetainAll {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Ira");
        set.add("Kavya");
        set.add("Mahi");
        set.add("Date");

        // Print the set before retaining elements
        System.out.println("Set before retainAll: " + set);

        // Create another Set with elements to be retained
        Set<String> elementsToRetain = new HashSet<>();
        elementsToRetain.add("Kavya");
        elementsToRetain.add("Date");

        // Retain elements using retainAll method
        set.retainAll(elementsToRetain);

        // Print the set after retaining elements
        System.out.println("Set after retainAll: " + set);
    }
}
