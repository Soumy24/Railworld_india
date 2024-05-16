package Day12_16May;
import java.util.ArrayList;
import java.util.List;

public class Listclear {
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Abhay");
        list.add("Nitin");
        list.add("Sriyan");

        // Print the list before clearing
        System.out.println("List before clear: " + list);

        // Clear the list using clear method
        list.clear();

        // Print the list after clearing
        System.out.println("List after clear: " + list);
    }
}

