package Day17_23May;

import java.util.ArrayList;
import java.util.List;

public class CoinChangeExample {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int sum = 4;
        List<List<Integer>> combinations = new ArrayList<>();
        int result = countCombinations(coins, sum, combinations);
        System.out.println("Number of combinations to make sum " + sum + " using given coins: " + result);
        System.out.println("Combinations:");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }

    public static int countCombinations(int[] coins, int sum, List<List<Integer>> combinations) {
        int[] dp = new int[sum + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        findCombinations(coins, sum, new ArrayList<>(), combinations);
        return dp[sum];
    }

    public static void findCombinations(int[] coins, int sum, List<Integer> current, List<List<Integer>> combinations) {
        if (sum == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int coin : coins) {
            if (sum - coin >= 0) {
                current.add(coin);
                findCombinations(coins, sum - coin, current, combinations);
                current.remove(current.size() - 1);
            }
        }
    }
}
