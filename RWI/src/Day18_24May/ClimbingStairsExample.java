// input n=3
package Day18_24May;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairsExample {

    // Function to print all the distinct ways to climb n stairs
    public static void printWays(int n, List<Integer> path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }

        if (n >= 1) {
            path.add(1);
            printWays(n - 1, path);
            path.remove(path.size() - 1);
        }

        if (n >= 2) {
            path.add(2);
            printWays(n - 2, path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;

        // Printing all the distinct ways
        System.out.println("Distinct ways to climb to the top:");
        printWays(n, new ArrayList<>());
    }
}
