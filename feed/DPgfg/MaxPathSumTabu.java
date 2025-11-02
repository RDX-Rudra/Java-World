import DPgfg.MaximumPathSum;

public class MaxPathSumTabu {
    public int maximumPath(int[][] mat) {
        int[][] dp = new int[mat.length][mat[0].length];
        int ans = -1;
        for(int r = 0; r < mat.length; r++) {
            for(int c=0; c< mat[0].length; c++){
                if(r==0){
                    dp[r][c] = mat[r][c];
                    ans = Math.max(ans, dp[r][c]);
                }
                else{
                    int left = c-1 >=0 ? dp[r-1][c-1] : Integer.MIN_VALUE;
                    int up = dp[r-1][c];
                    int right = c+1 < mat[0].length ? dp[r-1][c+1] : Integer.MIN_VALUE;
                    dp[r][c] = mat[r][c] + Math.max(left, Math.max(up, right));
                    if(r == mat.length -1){
                        ans = Math.max(ans, dp[r][c]);
                    }
                }
            }
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
