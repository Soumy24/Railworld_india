package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class ListremoveAll {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Parth");
        list.add("Rahul");
        list.add("Rashika");
        list.add("Sriyansh");

        // Print the list before removal
        System.out.println("List before removeAll: " + list);

        // Create another List with elements to be removed
        List<String> elementsToRemove = new ArrayList<>();
        elementsToRemove.add("Rahul");
        elementsToRemove.add("Sriyansh");

        // Remove elements using removeAll method
        list.removeAll(elementsToRemove);

        // Print the list after removal
        System.out.println("List after removeAll: " + list);
    }
}
