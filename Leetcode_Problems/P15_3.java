public class P15_3 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length -1;
        int i = 0;
        int[] answer = new int[n+1];
        for(int j = 0; j<=n; j++){
            answer[j] = answer[j-1] * nums[j];
        }
        while(i<n && n>=0){
            if(i!=0){
                answer[i] *= answer[i-1];
                answer[j] *=    
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(res);
    }
}
