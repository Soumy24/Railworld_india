package Day18_24May;

import java.util.ArrayList;
import java.util.List;

public class PairSumFinder {

    public static List<List<Integer>> findPairsWithSum(int[] array, int targetSum) {
        List<List<Integer>> pairs = new ArrayList<>();

        // Iterate through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Check for pairs with the current element
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(array[i]);
                    pair.add(array[j]);
                    pairs.add(pair);
                }
            }
        }

        return pairs;
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 3, 5, 7, 8, 9};
        int targetSum = 7;

        // Find pairs with the specified sum
        List<List<Integer>> pairs = findPairsWithSum(array, targetSum);

        // Print the pairs
        System.out.println("Pairs with sum " + targetSum + ":");
        for (List<Integer> pair : pairs) {
            System.out.println(pair);
        }
    }
}
