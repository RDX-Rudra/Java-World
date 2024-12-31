public class P31_12_983 {
    public static int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n+1];
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--){
            int c1 = costs[0] + dp[i+1];
            int j = i;
            while(j < n && days[j] < days[i] + 7){
                j++;
            }
            int c2 = costs[1] + dp[j];
            j = i;
            while(j < n && days[j] < days[i] + 30){
                j++;
            }
            int c3 = costs[2] + dp[j];
            dp[i] = Math.min(c1, Math.min(c2, c3));
        }
        return dp[0];
    }

    public static void main(String[] args) {
        int[] days = {1,4,6,7,8,20};
        int[] costs = {2,7,15};
        int ans = mincostTickets(days, costs);
        System.out.println(ans);
    }
}
