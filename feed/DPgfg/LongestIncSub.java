public class LongestIncSub {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        
    }

    public static void main(String[] args) {
        LongestIncSub obj = new LongestIncSub();
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = obj.lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}
