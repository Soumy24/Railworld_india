package Day17_23May;

import java.util.Arrays;

public class ArraySorter {

    public static void main(String[] args) {

        int[] numericArray = {5, 2, 9, 1, 5, 6};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));


        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));


        String[] stringArray = {"Ram", "Aanya", "Ritik", "kamal"};
        System.out.println("Original string array: " + Arrays.toString(stringArray));


        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
