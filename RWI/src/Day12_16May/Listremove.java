package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class Listremove {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Manish");
        list.add("Nakul");
        list.add("Parag");

        // Print the list before removal
        System.out.println("List before remove: " + list);

        // Remove an element from the list
        list.remove("Nakul");

        // Print the list after removal
        System.out.println("List after remove: " + list);
    }
}
