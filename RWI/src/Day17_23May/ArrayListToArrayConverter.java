package Day17_23May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArrayConverter {

    public static void main(String[] args) {
        // Sample ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Convert ArrayList to array
        Integer[] array = arrayList.toArray(new Integer[0]);

        // Print the array
        System.out.println("Array: " + Arrays.toString(array));
    }
}
