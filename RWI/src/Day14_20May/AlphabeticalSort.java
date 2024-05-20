//Collection- Alphabetic Sort using comparator
package Day14_20May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalSort {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("bhawna");
        strings.add("amit");
        strings.add("chinu");
        strings.add("divya");

        // Create a comparator to sort strings alphabetically
        Comparator<String> alphabeticalComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareToIgnoreCase(s2); // Use compareToIgnoreCase for case-insensitive comparison
            }
        };

        // Sort the list using the comparator
        Collections.sort(strings, alphabeticalComparator);

        // Print the sorted list
        for (String str : strings) {
            System.out.println(str);
        }
    }
}