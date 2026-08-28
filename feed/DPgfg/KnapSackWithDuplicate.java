public class KnapSackWithDuplicate {

    // Time Complexity: O(n * capacity)
    public int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;

        int[][] dp = new int[n][capacity + 1];

        // -1 means not calculated
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return helper(0, capacity, val, wt, dp);
    }

    private int helper(int i, int capacity, int[] val, int[] wt, int[][] dp) {

        // No items left
        if (i == val.length) {
            return 0;
        }

        // Already calculated
        if (dp[i][capacity] != -1) {
            return dp[i][capacity];
        }

        // Don't take current item
        int skip = helper(i + 1, capacity, val, wt, dp);

        int pick = 0;

        // Take current item
        if (wt[i] <= capacity) {
            pick = val[i] + helper(i, capacity - wt[i], val, wt, dp);
        }

        return dp[i][capacity] = Math.max(skip, pick);
    }

    public static void main(String[] args) {
        KnapSackWithDuplicate obj = new KnapSackWithDuplicate();
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;
        int result = obj.knapSack(val, wt, capacity);
        System.out.println("Maximum value in Knapsack with duplicates allowed: " + result);
    }
}
