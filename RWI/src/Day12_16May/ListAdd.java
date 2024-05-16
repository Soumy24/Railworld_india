package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Vidhi");
        list.add("Aarav");
        list.add("Zara");

        // Print the list after adding elements
        System.out.println("List after adding elements: " + list);

        // Add another element to the list
        list.add("Neha");

        // Print the list after adding another element
        System.out.println("List after adding 'Neha': " + list);
    }
}
