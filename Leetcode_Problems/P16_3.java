public class P16_3 {
    public static int findMaxLength(int[] nums) {
        int N = nums.length;
        int[] mp = new int[2*N+2];
        int current = N;
        int result = 0;

        for(int i = 0; i < N; i++) {
            current += (nums[i] << 1) - 1;
            if(current == N) {
                result = i+1;
            }
            else if(mp[current] == 0) {
                mp[current] = i+1;
            }
            else {
                result = Math.max(result, i - mp[current]+1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums= {0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(nums));
    }
}
