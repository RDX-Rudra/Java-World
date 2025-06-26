import java.util.List;
import java.util.ArrayList;

public class P24_6_2200 {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(nums.length - 1, i + k);
                for (int j = start; j <= end; j++) {
                    if (!seen[j]) {
                        result.add(j);
                        seen[j] = true;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        P24_6_2200 obj = new P24_6_2200();
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        List<Integer> result = obj.findKDistantIndices(nums, key, k);
        System.out.println("The indices of elements that are at most " + k + " distance from key " + key + " are: " + result);
    }
}
