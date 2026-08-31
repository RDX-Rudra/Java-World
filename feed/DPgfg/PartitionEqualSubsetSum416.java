public class PartitionEqualSubsetSum416 {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += nums[i];
        }
        int target =0;
        if(sum % 2 == 0){
            target = sum/2;
            return helperx(nums, target);
        }
        else return false;
    }

    // private boolean helper(int[] nums, int target, int index){ 
    //     if(index == nums.length){
    //         if(target == 0) return true;
    //         else return false;
    //     }
    //     if(target == 0) return true;
    //     return (helper(nums, target - nums[index], index+1) || helper(nums, target, index+1));
    // }

    private boolean helperx(int[] nums, int target){
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int x : nums) {

            for (int j = target; j >= x; j--) {
                dp[j] = dp[j] || dp[j - x];
            }
        }

        return dp[target];
    }

    public static void main(String[] args) {
        PartitionEqualSubsetSum416 solution = new PartitionEqualSubsetSum416();
        int[] test1 = {1, 5, 11, 5};
        int[] test2 = {1, 2, 3, 5};
        int[] test3 = {2, 2, 3, 5};
        int[] test4 = {1, 2, 5};
        int[] test5 = {1, 1};

        System.out.println("Input: [1, 5, 11, 5] -> Output: " + solution.canPartition(test1));
        System.out.println("Input: [1, 2, 3, 5] -> Output: " + solution.canPartition(test2));
        System.out.println("Input: [2, 2, 3, 5] -> Output: " + solution.canPartition(test3));
        System.out.println("Input: [1, 2, 5] -> Output: " + solution.canPartition(test4));
        System.out.println("Input: [1, 1] -> Output: " + solution.canPartition(test5));
    }
}
