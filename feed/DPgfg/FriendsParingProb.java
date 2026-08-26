public class FriendsParingProb {

    // Simple Memoization approach
    public int countFriendsPairings(int n) {
        // code here
        int[] dp = new int[n+1];
        return friends(n, dp);
    }
    private int friends(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n] != 0) return dp[n];
        return dp[n] = friends(n-1, dp) + (n-1)*friends(n-2, dp);
    }

    // Tabulation approach
    public int countFriendsPairingsTabulation(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        FriendsParingProb obj = new FriendsParingProb();
        int n = 4; // Example number of friends
        int resultMemoization = obj.countFriendsPairings(n);
        int resultTabulation = obj.countFriendsPairingsTabulation(n);
        System.out.println("Number of ways to pair " + n + " friends (Memoization): " + resultMemoization);
        System.out.println("Number of ways to pair " + n + " friends (Tabulation): " + resultTabulation);
    }
}
