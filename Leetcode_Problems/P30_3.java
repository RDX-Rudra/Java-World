
public class P30_3 {
    public static int subarraysWithKDistinct(int[] nums, int K) {
        int[] numFreq = new int[nums.length + 1]; // Array to store frequency of each number
        int distinct = 0, start = 0, minEnd = 0, total = 0; // Initialize variables
        while (distinct == K || minEnd < nums.length) { // Continue loop until distinct equals K or minEnd reaches end of nums array
            // Increment minEnd until distinct equals K or until reaching the end of nums array
            while (distinct < K && minEnd < nums.length) 
                if (numFreq[nums[minEnd++]]++ == 0) 
                    distinct++;
            int maxEnd = minEnd; // Initialize maxEnd to minEnd
            // Increment maxEnd until encountering a number that exceeds its frequency limit or reaching the end of nums array
            while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
                maxEnd++;
            // Count subarrays with exactly K distinct elements
            while (distinct == K) {
                if (numFreq[nums[start++]]-- == 1) // Decrement frequency of nums[start] and check if it becomes 0
                    distinct--; // If frequency becomes 0, decrement distinct
                total += (maxEnd - minEnd + 1); // Add the count of subarrays with exactly K distinct elements
            }
        }
        return total; // Return the total count of subarrays with exactly K distinct elements
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3}; // Input array
        int k = 2; // K distinct elements
        System.out.println(subarraysWithKDistinct(nums, k)); // Output: 7
    } 
}
