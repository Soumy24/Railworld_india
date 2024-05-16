package Day12_16May;

import java.util.HashSet;
import java.util.Set;

public class SetHashCode {
    public static void main(String[] args) {
        // Create a Set and add some elements
        Set<String> set = new HashSet<>();
        set.add("Ram");
        set.add("Ishi");
        set.add("Raj");

        // Get the hash code of the set
        int hashCode = set.hashCode();

        // Print the hash code
        System.out.println("Hash code of the set: " + hashCode);

        // Modify the set by adding another element
        set.add("Date");

        // Get the new hash code of the modified set
        int newHashCode = set.hashCode();

        // Print the new hash code
        System.out.println("Hash code of the modified set: " + newHashCode);
    }
}