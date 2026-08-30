public class LongestCommonSubstring {
    public int longCommSubstr(String s1, String s2) {
        // code here
        int m=s1.length();
        int n= s2.length();
        int max=0;
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(s1.charAt(i) == s2.charAt(j)){
                    dp[i+1][j+1] = 1+dp[i][j];
                }
                max = Math.max(max, dp[i+1][j+1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestCommonSubstring obj = new LongestCommonSubstring();
        String s1 = "abcde";
        String s2 = "ace";
        int result = obj.longCommSubstr(s1, s2);
        System.out.println("Length of Longest Common Substring: " + result);
    }
}
