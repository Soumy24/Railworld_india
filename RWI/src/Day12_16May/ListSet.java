package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class ListSet {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Harshu");
        list.add("Lakshya");
        list.add("Kush");

        // Print the list before modification
        System.out.println("List before set: " + list);

        // Replace an element at a specific index using set method
        list.set(1, "Lavish");

        // Print the list after modification
        System.out.println("List after set: " + list);
    }
}
