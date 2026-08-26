public class CountSquareSubMat {
    public int countSquares(int[][] matrix) {
        int m= matrix.length;
        int n =matrix[0].length;
        int[][] dp = new int[m][n];
        int sum=0;
        dp[0][0] = matrix[0][0];
        sum += matrix[0][0];
        for(int i=1; i<n; i++){
            dp[0][i] = matrix[0][i];
            sum += matrix[0][i];
        }
        for(int i=1; i<m; i++){
            dp[i][0] = matrix[i][0];
            sum += matrix[i][0];
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] !=0){
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                }
                else dp[i][j] = matrix[i][j];
                sum += dp[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        CountSquareSubMat obj = new CountSquareSubMat();
        int[][] matrix = {
            {0, 1, 1, 1},
            {1, 1, 1, 1},
            {0, 1, 1, 1}
        };
        int result = obj.countSquares(matrix);
        System.out.println("Total number of square submatrices with all ones: " + result);
    }
}
