public class P7_5_3341 {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = moveTime[0][0];
        
    }

    public static void main(String[] args) {
        int[][] moveTime = {{1,2,3},{4,5,6},{7,8,9}};
        P7_5_3341 obj = new P7_5_3341();
        System.out.println(obj.minTimeToReach(moveTime)); 
    }
}
