package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SettoArray{
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Shreya");
        set.add("Tanisha");
        set.add("Vidhi");

        // Convert the set to an array using toArray method
        String[] array = set.toArray(new String[set.size()]);

        // Print the elements of the array
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
