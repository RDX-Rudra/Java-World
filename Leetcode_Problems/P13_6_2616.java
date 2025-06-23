import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class P13_6_2616 {
    public int minimizeMax(int[] nums, int p) {
        if(p==0)
            return 0;
        Arrays.sort(nums);
        int[] diffs = new int[nums.length - 1];
        int index = 0;
        for (int i=1; i<nums.length; i+=2) {
            diffs[index] = nums[i] - nums[i-1];
            index++;
        }
        Arrays.sort(diffs);
        for(int diff : diffs) {
            System.out.print(diff + " ");
        }
        if(p<=diffs.length) {
            return diffs[p-1];
        }else {
            return diffs[diffs.length - 1];
        }
    }

    public static void main(String[] args) {
        P13_6_2616 obj = new P13_6_2616();
        int[] nums = {3,4,2,3,2,1,2};
        int p = 3;
        System.out.println(obj.minimizeMax(nums, p)); // Example output 1
    }
}
