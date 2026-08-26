public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        if(obstacleGrid[0][0] ==1) return 0;
        else dp[0][0] = 1;
        for(int i=1; i<n; i++){
            if(dp[0][i-1] !=0 && obstacleGrid[0][i] == 0)
                dp[0][i]= 1;
            else
                dp[0][i]=0;
        }
        for(int i=1; i<m; i++){
            if(dp[i-1][0] !=0 && obstacleGrid[i][0] == 0)
                dp[i][0]= 1;
            else
                dp[i][0]=0;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(obstacleGrid[i][j] == 0)
                    dp[i][j]= dp[i][j-1] + dp[i-1][j];
                else
                    dp[i][j]=0;
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        UniquePath2 obj = new UniquePath2();
        int[][] obstacleGrid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        int result = obj.uniquePathsWithObstacles(obstacleGrid);
        System.out.println("Number of unique paths from top-left to bottom-right with obstacles: " + result);
    }
}
