public class P26_6_2311 {
    public int longestSubsequence(String s, int k) {
        int count = 0;
        int value = 0;
        int result = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '1'){
                value += Math.pow(2, count);
                count++;
                if(value<=k) {
                    result++;
                } 
            }
            else{
                count++;
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        P26_6_2311 obj = new P26_6_2311();
        String s = "1001010";
        int k = 5;
        int result = obj.longestSubsequence(s, k);
        System.out.println("The length of the longest subsequence is: " + result);
    }
}
