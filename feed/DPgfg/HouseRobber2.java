public class HouseRobber2 {

    // Tabulation approach to solve the House Robber II problem (circular arrangement of houses)
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        if(n==3) return Math.max((Math.max(nums[0], nums[1])), nums[2]);
        int[][] dp= new int[2][n];
        dp[0][0] = nums[0];
        dp[0][1] = Math.max(nums[0], nums[1]);
        dp[1][0] = 0;
        dp[1][1] = nums[1];
        dp[1][2] = Math.max(nums[1], nums[2]);
        for(int i=2; i<n-1; i++){
            dp[0][i] = Math.max(dp[0][i-2] + nums[i], dp[0][i-1]);
            dp[1][i+1] = Math.max(dp[1][i+1-2] + nums[i+1], dp[1][i]);
        }
        return Math.max(dp[0][n-2], dp[1][n-1]);
    }


    // Space optimized Tabulation approach to solve the House Robber II problem (circular arrangement of houses)
    public int rob1(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int case1 = robRange(nums, 0, n - 2);
        int case2 = robRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);

            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        HouseRobber2 obj = new HouseRobber2();
        int[] nums = {2, 3, 2};
        int result = obj.rob(nums);
        System.out.println("Maximum amount that can be robbed in a circular arrangement: " + result);
    }
}
