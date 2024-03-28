import java.util.HashMap;

public class P28_3 {
    public static int maxSubarrayLength(int[] nums, int k) {
        int i=0,j=0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int length=0;      
        while(j<nums.length){
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            while (freq.get(nums[j])>k) {
                freq.put(nums[i], freq.get(nums[i])-1);
                i++;
            }
            length = Math.max(length, j-i+1);
            j++;
        }  
        return length;  
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,1,2};
        int k = 2;
        System.out.println(maxSubarrayLength(arr, k));
    }
}
