public class P22_6_1248 {
    public static int numberOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 1;
        int ans = 0, t = 0;
        for (int v : nums) {
            t += v & 1;
            if (t - k >= 0) {
                ans += cnt[t - k];
            }
            cnt[t]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 1, 1 };
        int k = 3;
        int res = numberOfSubarrays(nums, k);
        System.out.println(res);
    }
}
