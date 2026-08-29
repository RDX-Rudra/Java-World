import java.util.Arrays;

public class MountainArr1671 {
    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;

        int[] dpI = new int[n]; // Increasing subsequence ending at i
        int[] dpD = new int[n]; // Decreasing subsequence starting at i

        Arrays.fill(dpI, 1);
        Arrays.fill(dpD, 1);

        // LIS ending at every index
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dpI[i] = Math.max(dpI[i], dpI[j] + 1);
                }
            }
        }

        // LDS starting at every index
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    dpD[i] = Math.max(dpD[i], dpD[j] + 1);
                }
            }
        }

        int maxMountain = 0;

        for (int i = 0; i < n; i++) {

            // i must be a proper peak
            if (dpI[i] > 1 && dpD[i] > 1) {
                int mountainLength = dpI[i] + dpD[i] - 1;
                maxMountain = Math.max(maxMountain, mountainLength);
            }
        }

        return n - maxMountain;
    }

    public static void main(String[] args) {
        MountainArr1671 obj = new MountainArr1671();
        int[] nums = {2, 1, 1, 5, 6, 2, 3, 1};
        int result = obj.minimumMountainRemovals(nums);
        System.out.println("Minimum removals to make mountain array: " + result);
    }
}
