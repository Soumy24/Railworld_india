package Day18_24May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConverter {

    public static void main(String[] args) {
        // Sample array
        Integer[] array = {1, 2, 3, 4, 5};

        // Convert array to ArrayList
        List<Integer> arrayList = Arrays.asList(array);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
