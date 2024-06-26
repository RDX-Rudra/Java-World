public class p26_1 {
    public static int findPaths(int m, int n, int N, int x, int y) {
        final int M = 1000000000 + 7;
        int[][] dp = new int[m][n];
        dp[x][y] = 1;
        int count = 0;

        for (int moves = 1; moves <= N; moves++) {
            int[][] temp = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == m - 1) count = (count + dp[i][j]) % M;
                    if (j == n - 1) count = (count + dp[i][j]) % M;
                    if (i == 0) count = (count + dp[i][j]) % M;
                    if (j == 0) count = (count + dp[i][j]) % M;
                    temp[i][j] = (
                            ((i > 0 ? dp[i - 1][j] : 0) + (i < m - 1 ? dp[i + 1][j] : 0)) % M +
                            ((j > 0 ? dp[i][j - 1] : 0) + (j < n - 1 ? dp[i][j + 1] : 0)) % M
                    ) % M;
                }
            }
            dp = temp;
        }

        return count;
    }

    public static void main(String[] args) {
        int m=2, n=2;
        int maxMove = 2;
        int startColumn=0, startRow=0;
        System.out.println(findPaths(m, n, maxMove, startRow, startColumn));
    }
}
