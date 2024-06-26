public class P20_5_1863 {
    public static int subsetXORSum(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        // Iterate through all possible subsets
        for (int i = 0; i < (1 << n); i++) {
            int subsetXor = 0;
            for (int j = 0; j < n; j++) {
                // Check if the j-th element is in the i-th subset
                if ((i & (1 << j)) != 0) {
                    subsetXor ^= nums[j];
                }
            }
            totalSum += subsetXor;
        }
        return totalSum;
    }
    public static void main(String args[]){
        int[] nums = {1, 3};
        System.out.println(subsetXORSum(nums));
    }

}    
