public class P3_1_2270 {
    public int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }

    public static void main(String[] args) {
        P3_1_2270 solution = new P3_1_2270();
        int[] nums = {10,4,-8,7};
        System.out.println(solution.waysToSplitArray(nums));
    }
}
