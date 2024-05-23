package Day17_23May;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] array = {2, 5, 18, 10, 2, 6};
        int k = 3;

        Arrays.sort(array);

        System.out.println("K maximum elements:");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\nK minimum elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }
    }
}