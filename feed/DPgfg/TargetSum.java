public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=Math.abs(nums[i]);
        }
        if(Math.abs(target) > sum) return 0;
        int[][] dp = new int[nums.length][target +1+2*sum];
        for (int i = 0; i < nums.length; i++) {
            java.util.Arrays.fill(dp[i], -sum-1);
        }
        return helper(0, nums, target, dp, sum);
    }

    private int helper(int i, int[] nums, int target, int[][] dp, int sum){
        if(i==nums.length){
            if(target == 0) return 1;
            else return 0;
        }
        if(dp[i][target+sum] != -sum-1) return dp[i][target+sum];
        int plus = helper(i+1, nums, target- nums[i], dp, sum);
        int minus = helper(i+1, nums, target + nums[i], dp, sum);
        return dp[i][target+sum] = plus + minus;
    }

    public static void main(String[] args) {
        TargetSum obj = new TargetSum();
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        int result = obj.findTargetSumWays(nums, target);
        System.out.println("Number of ways to assign symbols to make the sum equal to target: " + result);
    }
}
