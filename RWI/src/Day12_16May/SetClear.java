package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetClear {

    public static void main(String[] args) {
        // Creating a set
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Displaying the set before clear
        System.out.println("Set before clear: " + set);

        // Using clear method to remove all elements from the set
        set.clear();

        // Displaying the set after clear
        System.out.println("Set after clear: " + set);
    }
}
