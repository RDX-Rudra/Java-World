import java.util.Arrays;

public class AltrP26_3 {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] found = new boolean[n+1];
        for(int i = 0;i< n; i++){
            if (nums[i]>0 && nums[i]<= n){
                found[nums[i]]=true;

            }
        }
        for(int i= 1;i<=n;i++){
            if(!found[i]){
                return i;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1,0};
        System.out.println(firstMissingPositive(nums));
    }
}
