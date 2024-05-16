package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class ListaddAll{
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Vani");
        list.add("Viti");
        list.add("Sai");

        // Print the list before adding elements
        System.out.println("List before addAll: " + list);

        // Create another List with elements to be added
        List<String> elementsToAdd = new ArrayList<>();
        elementsToAdd.add("John");
        elementsToAdd.add("Ananya");

        // Add elements using addAll method
        list.addAll(elementsToAdd);

        // Print the list after adding elements
        System.out.println("List after addAll: " + list);
    }
}
