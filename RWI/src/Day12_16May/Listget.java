package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class Listget {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Kriti");
        list.add("Sanvi");

        // Get an element at a specific index using get method
        String elementAtIndex1 = list.get(1);

        // Print the element at index 1
        System.out.println("Element at index 1: " + elementAtIndex1);
    }
}
