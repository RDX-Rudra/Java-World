import java.util.Arrays;

public class P26_3 {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i=1, j=0;
        while(j<nums.length){
            if(j>=1 && nums[j] == nums[j-1])
                j++;
            else if(nums[j]>=1){
                if(nums[j] != i){
                    return i;
                }
                else{
                    i++;
                    j++;
                }
            }
            else
                j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,0};
        System.out.println(firstMissingPositive(nums));
    }
}
