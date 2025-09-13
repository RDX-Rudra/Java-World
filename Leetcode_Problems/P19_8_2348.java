public class P19_8_2348 {
    public long zeroFilledSubarray(int[] nums) {
        int i =0, j=0;
        long count =0;
        while(i<nums.length && j<nums.length){
            if(nums[i] == 0 && nums[j] == 0){
                System.out.println(i + " " + j);
                i++;
                count++;
            }
            if(nums[i] !=0 && nums[j] == 0){
                System.out.println(i + " " + j);
                j++;
                count++;
            }
            else{
                System.out.println(i + " " + j);
                i++;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        P19_8_2348 solution = new P19_8_2348();
        int[] nums = {1, 3, 0, 0, 2, 0, 0, 4};
        System.out.println(solution.zeroFilledSubarray(nums)); // Output: 6
    }
}
