public class P24_3 {
    public static int findDuplicate(int[] nums) {
        int n= nums.length;
        int[] com = new int[n-1];
        for(int i=0; i<nums.length; i++){
            if(com[nums[i]-1]>=1){
                return nums[i];
            }
            com[nums[i]-1]++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
}
