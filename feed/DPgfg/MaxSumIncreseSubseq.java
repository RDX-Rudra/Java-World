public class MaxSumIncreseSubseq {
    public int maxSumIS(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp= new int[n];
        dp[0] = arr[0];
        int maxSum=arr[0];
        for(int i=1; i<n; i++){
            dp[i] = arr[i];
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i]){
                    dp[i]= Math.max(dp[i], arr[i]+dp[j]);
                }
            }
            maxSum = Math.max(dp[i], maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSumIncreseSubseq solution = new MaxSumIncreseSubseq();
        int[] test1 = {1, 101, 2, 3, 100, 4, 5};
        int[] test2 = {3, 4, 5, 10};
        int[] test3 = {10, 5, 4, 3};

        System.out.println("Input: [1, 101, 2, 3, 100, 4, 5] -> Output: " + solution.maxSumIS(test1));
        System.out.println("Input: [3, 4, 5, 10] -> Output: " + solution.maxSumIS(test2));
        System.out.println("Input: [10, 5, 4, 3] -> Output: " + solution.maxSumIS(test3));
    }
}
