public class UniquePaths {
    private int countPaths(int m, int n, int[][] dp) {
        if(m == 1 || n == 1) {
            return dp[m][n] = 1;
        }
        if(m==0 || n==0) {
            return 0;
        }
        if(dp[m][n] != -1) {
            return dp[m][n];
        }
        int downPaths = countPaths(m - 1, n, dp);
        int rightPaths = countPaths(m, n - 1, dp);
        return dp[m][n] = downPaths + rightPaths;
    }

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return countPaths(m, n, dp);
    }

    public static void main(String[] args) {
        UniquePaths obj = new UniquePaths();
        int m = 3, n = 7;
        int result = obj.uniquePaths(m, n);
        System.out.println("Number of unique paths from top-left to bottom-right: " + result);
    }
}
