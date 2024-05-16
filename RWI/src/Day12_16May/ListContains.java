package Day12_16May;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class ListContains {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Rajvir");
        list.add("Ranveer");
        list.add("Ayush");

        // Check if the list contains a specific element using contains method
        boolean containsRanveer = list.contains("Ranveer");
        boolean containsJohn = list.contains("John");

        // Print the result of contains method
        System.out.println("List contains 'Ranveer': " + containsRanveer);
        System.out.println("List contains 'John': " + containsJohn);
    }
}
