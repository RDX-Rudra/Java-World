package GFG_problems;

import java.util.Arrays;

public class p1_15 {
    public static int max_courses(int n, int total, int[] cost) {
        int[][] dp = new int[n + 1][total + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= total; j++) {
                dp[i][j] = -1;
            }
        }
        return solve(n, total, cost, 0, dp);
    }

    private static int solve(int y, int total, int[] cost, int i, int[][] dp) {
        if (i == y) {
            return 0;
        }
        if (total == 0) {
            return 0;
        }
        if (dp[i][total] != -1) {
            return dp[i][total];
        }
        if (total >= cost[i]) {
            return dp[i][total] = Math.max(
                    solve(y, total, cost, i + 1, dp),
                    1 + solve(y, total - cost[i] + (int) Math.floor(0.9 * cost[i]), cost, i + 1, dp)
            );
        } else {
            return dp[i][total] = solve(y, total, cost, i + 1, dp);
        }
    }
    
    public static int max_courses_bottom_up(int n, int total, int[] cost) {
        int[][] dp = new int[n + 1][total + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= total; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j];
                    if (j >= cost[i - 1]) {
                        dp[i][j] = Math.max(dp[i][j], 1 + dp[i - 1][j - cost[i - 1]]);
                    }
                }
            }
        }

        return dp[n][total];
    }

    public static void main(String[] args) {
        int n1 = 2;
        int total1 = 10;
        int[] cost1 = {10, 9};
        System.out.println(max_courses(n1, total1, cost1));  // Output: 2

        int n2 = 11;
        int total2 = 10;
        int[] cost2 = {10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(max_courses(n2, total2, cost2));  // Output: 10
    }
}
