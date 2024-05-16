package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetaddAll {

    public static void main(String[] args) {
        // Creating the first set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Creating the second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        // Displaying the sets before addAll
        System.out.println("Set 1 before addAll: " + set1);
        System.out.println("Set 2: " + set2);

        // Using addAll method to add elements of set2 to set1
        set1.addAll(set2);

        // Displaying the sets after addAll
        System.out.println("Set 1 after addAll: " + set1);
    }
}
