//input =2
package Day18_24May;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {


    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }


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
        int n = 2;

        System.out.println("Number of distinct ways: " + climbStairs(n));

        System.out.println("Distinct ways to climb to the top:");
        printWays(n, new ArrayList<>());
    }
}
