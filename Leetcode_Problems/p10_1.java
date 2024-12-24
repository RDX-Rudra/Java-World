public class p10_1 {
    public static int minFallingPathSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int minPrev = Integer.MAX_VALUE;

                if (j > 0) {
                    minPrev = Math.min(minPrev, matrix[i - 1][j - 1]);
                }

                minPrev = Math.min(minPrev, matrix[i - 1][j]);

                if (j < cols - 1) {
                    minPrev = Math.min(minPrev, matrix[i - 1][j + 1]);
                }

                matrix[i][j] += minPrev;
            }
        }

        int minSum = Integer.MAX_VALUE;
        for (int num : matrix[rows - 1]) {
            minSum = Math.min(minSum, num);
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[][] arr = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(minFallingPathSum(arr));
    }
}
