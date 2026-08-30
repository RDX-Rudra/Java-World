import java.util.ArrayList;
import java.util.Arrays;

public class LongestIncSub {
    // using recursion + memoization
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

    // using tabulation
    public int lengthOfLISTabulation(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }
        return maxLen;
    }

    // using binary search
    public int lengthOfLISBinarySearch(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x : nums){
            if(ans.size()== 0 || x > ans.get(ans.size()-1)){
                ans.add(x);
            }
            else replace(ans, x);
        }   
        return ans.size();  
    }   

    private void replace(ArrayList<Integer> ans, int x){
        int l = 0, r = ans.size()-1;
        while(l < r){
            int mid = l + (r-l)/2;
            if(ans.get(mid) >= x) r = mid;
            else l = mid + 1;
        }
        ans.set(r, x);
    }
    public static void main(String[] args) {
        LongestIncSub obj = new LongestIncSub();
        int[] nums = {10,9,2,5,3,7,101,18};
        int result = obj.lengthOfLIS(nums);
        System.out.println("Length of Longest Increasing Subsequence: " + result);
    }
}
