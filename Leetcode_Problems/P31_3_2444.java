public class P31_3_2444 {
    public static long countSubarrays(int[] nums, int minK, int maxK) {
        int left=0, right=0;
        long ans = 0;
        boolean findmin = false, findmax = false;
        while (right <nums.length) {
            if(nums[right]<=maxK && nums[right]>=minK){
                if(nums[right] == minK)
                    findmin = true;
                if(nums[right] == maxK)
                    findmax = true;
                if(findmax == true && findmin == true){
                    ans ++;
                }
                right++;
            }
            else{
                right++;
                left = right;
                findmax = false;
                findmin = false;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int minK = 1, maxK = 1;
        System.out.println(countSubarrays(nums, minK, maxK));
    }
}
