import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset368 {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> result = new java.util.ArrayList<>();
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        Arrays.sort(nums);
        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);
        int maxIndex = 0;
        int maxSize = 1;
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if(dp[i] > maxSize){
                maxSize = dp[i];
                maxIndex = i;
            }
        }

        while(maxIndex >= 0){
            result.add(0, nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        return result;
    }

    public static void main(String[] args) {
        LargestDivisibleSubset368 obj = new LargestDivisibleSubset368();
        int[] nums = {1, 2, 3};
        List<Integer> result = obj.largestDivisibleSubset(nums);
        System.out.println("Largest Divisible Subset: " + result);
    }
}
