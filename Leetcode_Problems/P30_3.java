import java.util.HashMap;

public class P30_3 {
    public static int subarraysWithKDistinct(int[] nums, int K) {
        int[] numFreq = new int[nums.length+1];
        int distinct = 0, start = 0, minEnd = 0, total = 0;
        while (distinct == K || minEnd < nums.length) {
            while (distinct < K && minEnd < nums.length) 
			    if (numFreq[nums[minEnd++]]++ == 0) 
                distinct++;
            int maxEnd = minEnd;
            while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
			    maxEnd++;
            while (distinct == K) {
                if (numFreq[nums[start++]]-- == 1)
                distinct--;
                total += (maxEnd - minEnd + 1);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(subarraysWithKDistinct(nums, k)); // Output: 7
    }
    
}
