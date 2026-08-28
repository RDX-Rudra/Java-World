public class LongestComSubseq1143 {
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

    public static void main(String[] args) {
        LongestComSubseq1143 obj = new LongestComSubseq1143();
        String text1 = "abcde";
        String text2 = "ace";
        int result = obj.longestCommonSubsequence(text1, text2);
        System.out.println("Length of Longest Common Subsequence: " + result);
    }
}
