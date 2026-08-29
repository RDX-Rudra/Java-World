public class LongestComSubseq1143 {

    // using memoization
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] arr : dp){
            java.util.Arrays.fill(arr, -1);
        }
        return helper(0, 0, text1, text2, dp);
    }

    private int helper(int i, int j, String t1, String t2, int[][] dp){
        if(i == t1.length() || j == t2.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        if(t1.charAt(i) == t2.charAt(j)){
            return dp[i][j] = 1 + helper(i+1, j+1, t1, t2, dp);
        }
        else return dp[i][j] = Math.max(helper(i, j+1, t1, t2, dp), helper(i+1, j, t1, t2, dp));
    }

    // using tabulation
    // public int longestCommonSubsequenceTabulation(String text1, String text2) {
    //     int m = text1.length();
    //     int n = text2.length();
    //     int[][] dp = new int[text1.length()][text2.length()];
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             if(text1.charAt(i) == text2.charAt(j)){
    //                 dp[i][j] = 1 + (i > 0 && j > 0 ? dp[i-1][j-1] : 0);
    //             }
    //             else{
    //                 dp[i][j] = Math.max(i > 0 ? dp[i-1][j] : 0, j > 0 ? dp[i][j-1] : 0);
    //             }
    //         }
    //     }
    //     return dp[text1.length()-1][text2.length()-1];
    // }

    public int longestCommonSubsequenceTabulation(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        LongestComSubseq1143 obj = new LongestComSubseq1143();
        String text1 = "abcde";
        String text2 = "ace";
        int result = obj.longestCommonSubsequence(text1, text2);
        System.out.println("Length of Longest Common Subsequence: " + result);
    }
}
