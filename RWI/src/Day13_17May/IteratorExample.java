package Day13_17May;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        // Create an ArrayList and populate it with some elements
        List<String> list = new ArrayList<>();
        list.add("Karan");
        list.add("Aadhvita");
        list.add("Anay");

        // Get the iterator
        Iterator<String> iterator = list.iterator();

        // Iterate through the list using the iterator
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            // Optionally remove elements during iteration
            if (element.equals("Aadhvita")) {
                iterator.remove(); // Remove "Banana" from the list
            }
        }

        // Print the list after iteration and removal
        System.out.println("List after iteration: " + list);
    }
}
