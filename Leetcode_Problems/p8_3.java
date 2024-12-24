import java.util.*;

public class p8_3 {
    public static int maxFrequencyElements(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(1001, 0)); // Initialize res with a capacity of at least 1001 (assuming nums[i] <= 1000)
        int temp = 0;
        for(int i = 0; i < nums.length; i++){
            int k = res.get(nums[i]);
            res.set(nums[i], k + 1);
            temp = Math.max(temp, res.get(nums[i]));
        }
        int count = 0;
        for(int j = 0; j < res.size(); j++){
            if(res.get(j) == temp){
                count += temp;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1, 4};
        System.out.println(maxFrequencyElements(nums));
    }
}
