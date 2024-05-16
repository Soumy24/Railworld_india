package Day12_16May;

import java.util.ArrayList;
import java.util.List;

public class ListtoArray {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Vansh");
        list.add("Samar");
        list.add("Vivaan");

        // Convert the list to an array using toArray method
        String[] array = list.toArray(new String[list.size()]);

        // Print the elements of the array
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}
