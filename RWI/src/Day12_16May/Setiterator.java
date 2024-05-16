package Day12_16May;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setiterator {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Kairav");
        set.add("sonu");

        // Create an iterator for the set
        Iterator<String> iterator = set.iterator();

        // Use the iterator to traverse and print elements
        System.out.println("Elements in the set:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
