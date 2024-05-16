package Day12_16May;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listiterator{
    public static void main(String[] args) {
        // Create a List and add some elements
        List<String> list = new ArrayList<>();
        list.add("Riya");
        list.add("Abhay");
        list.add("Devin");

        // Create an iterator for the list
        Iterator<String> iterator = list.iterator();

        // Use the iterator to traverse and print elements
        System.out.println("Elements in the list:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
