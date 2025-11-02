public class MaximumPathSum {
    private int pathSum(int[][] mat, int r, int c, int[][] dp) {
        if(c < 0 || c >= mat[0].length || r >= mat.length) {
            return Integer.MIN_VALUE;
        }
        if(r == mat.length - 1){
            return mat[r][c];
        }
        if(dp[r][c] != 0) return dp[r][c];
        int left = pathSum(mat, r+1, c-1, dp);
        int down = pathSum(mat, r+1, c, dp);
        int right = pathSum(mat, r+1, c+1, dp);
        dp[r][c] = mat[r][c] + Math.max(left, Math.max(down, right));
        return dp[r][c];
    }

    public int maximumPath(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        int ans = -1;
        for(int c = 0; c < mat[0].length; c++) {
            ans = Math.max(ans, pathSum(mat, 0, c, dp));
        }
        return ans;
    }

    public static void main(String[] args) {
        MaximumPathSum obj = new MaximumPathSum();
        int[][] mat = {
            {3, 6, 1},
            {2, 3, 4},
            {5, 5, 1}
        };
        int result = obj.maximumPath(mat);
        System.out.println("Maximum path sum: " + result);
    }
}