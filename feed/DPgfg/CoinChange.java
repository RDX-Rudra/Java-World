public class CoinChange{
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[n][amount + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        int ans = helper(0, coins, amount, dp);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int helper(int i, int[] coins, int amount, int[][] dp) {

        // Amount completed
        if (amount == 0) {
            return 0;
        }

        // No coins left
        if (i == coins.length) {
            return Integer.MAX_VALUE;
        }

        // Already calculated
        if (dp[i][amount] != -1) {
            return dp[i][amount];
        }

        // Skip current coin
        int skip = helper(i + 1, coins, amount, dp);

        // Pick current coin
        int pick = Integer.MAX_VALUE;

        if (amount >= coins[i]) {
            int result = helper(i, coins, amount - coins[i], dp);

            if (result != Integer.MAX_VALUE) {
                pick = 1 + result;
            }
        }

        return dp[i][amount] = Math.min(skip, pick);
    }

    public static void main(String[] args) {
        CoinChange obj = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = obj.coinChange(coins, amount);
        System.out.println("Minimum number of coins needed: " + result);
    }
}