package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetremoveAll {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Aarohi");
        set.add("Devanshi");
        set.add("Diya");
        set.add("Date");

        // Print the set before removal
        System.out.println("Set before removeAll: " + set);

        // Create another Set with elements to be removed
        Set<String> elementsToRemove = new HashSet<>();
        elementsToRemove.add("Devanshi");
        elementsToRemove.add("Date");

        // Remove elements using removeAll method
        set.removeAll(elementsToRemove);

        // Print the set after removal
        System.out.println("Set after removeAll: " + set);
    }
}
