public class P12_3_2592 {
    public static int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0) neg++;
            if(nums[i] > 0) {
                pos = nums.length - i;
                break;
            }
        }
        return Math.max(pos, neg);
    }

    public static void main(String[] args) {
        int nums[] = {-2,-1,-1,1,2,3};
        int ans = maximumCount(nums);
        System.out.println(ans);
    }
}
