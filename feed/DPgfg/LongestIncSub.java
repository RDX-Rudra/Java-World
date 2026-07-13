public class LongestIncSub {
    private int lisHelper(int[] nums, int p, int c, int[][] dp){
        if(c >= nums.length) return 0;
        int dpP = p + 1; // map -1 -> 0 to avoid negative index
        if(dp[dpP][c] != 0) return dp[dpP][c];
        int take = 0;
        if(p == -1 || nums[c] > nums[p]) {
            take = 1 + lisHelper(nums, c, c + 1, dp);
        }
        int skip = lisHelper(nums, p, c + 1, dp);
        return dp[dpP][c] = Math.max(take, skip);

    }

    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length + 1][nums.length];
        return lisHelper(nums, -1, 0, dp);
    }

    public static void main(String[] args) {
        LongestIncSub obj = new LongestIncSub();
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = obj.lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}
