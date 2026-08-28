public class EditDistance72 {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] arr: dp){
            java.util.Arrays.fill(arr, -1);
        }
        return helper(0, 0, word1, word2, dp);
    }
    private int helper(int i, int j, String w1, String w2, int[][] dp){
        if(i == w1.length() && j== w2.length()){
            return 0;
        }
        else if(i == w1.length() || j== w2.length()){
            return Math.abs(w1.length() +w2.length() -i-j);
        }
        else if(dp[i][j] != -1) return dp[i][j];
        else if(w1.charAt(i) == w2.charAt(j)){
            return dp[i][j] = helper(i+1, j+1, w1, w2, dp);
        }
        
        else{
            int insert = helper(i, j+1, w1, w2, dp);
            int delete = helper(i+1, j, w1, w2, dp);
            int replace = helper(i+1, j+1, w1, w2, dp);
            return dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
        }
    }

    public static void main(String[] args) {
        EditDistance72 obj = new EditDistance72();
        String word1 = "horse";
        String word2 = "ros";
        int result = obj.minDistance(word1, word2);
        System.out.println("Minimum edit distance between the two words: " + result);
    }
}
