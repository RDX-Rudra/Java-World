public class P15_3 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length - 1;
        int[] answer1 = new int[n + 1];
        int[] answer2 = new int[n + 1];
        int[] answer = new int[n + 1];
        
        // Calculate products of elements from left to right
        for (int j = 0; j <= n; j++) {
            if (j == 0) {
                answer1[j] = nums[j];
            } else {
                answer1[j] = answer1[j - 1] * nums[j];
            }
        }
        
        // Calculate products of elements from right to left
        for (int j = n; j >= 0; j--) {
            if (j == n) {
                answer2[j] = nums[j];
            } else {
                answer2[j] = answer2[j + 1] * nums[j];
            }
        }
        
        // Calculate final answer by multiplying corresponding elements from both arrays
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                answer[i] = answer2[i + 1];
            } else if (i == n) {
                answer[i] = answer1[i - 1];
            } else {
                answer[i] = answer1[i - 1] * answer2[i + 1];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] res = productExceptSelf(nums);
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
