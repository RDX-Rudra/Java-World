public class P12_6_3423 {
    public int maxAdjacentDistance(int[] nums) {
        int maxDistance = 0;
        for (int i = 1; i < nums.length; i++) {
            maxDistance = Math.max(maxDistance, Math.abs(nums[i] - nums[i - 1]));
        }
        maxDistance = Math.max(maxDistance, Math.abs(nums[0] - nums[nums.length - 1]));
        return maxDistance;
    } 

    public static void main(String[] args) {
        P12_6_3423 obj = new P12_6_3423();
        int[] nums = {1,2,4};
        System.out.println(obj.maxAdjacentDistance(nums)); // Output: 3
    }
}
