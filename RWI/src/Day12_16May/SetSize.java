package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetSize {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Manvik");
        set.add("Prisha");
        set.add("Sara");

        // Get the size of the set using size method
        int setSize = set.size();

        // Print the size of the set
        System.out.println("Size of the set: " + setSize);
    }
}
