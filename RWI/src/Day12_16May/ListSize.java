package Day12_16May;


import java.util.ArrayList;
import java.util.List;

public class ListSize {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Sujal");
        list.add("Tanay");
        list.add("Tejas");

        // Get the size of the list using size method
        int listSize = list.size();

        // Print the size of the list
        System.out.println("Size of the list: " + listSize);
    }
}
