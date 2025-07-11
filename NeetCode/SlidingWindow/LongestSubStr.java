public class LongestSubStr {
    public int lengthOfLongestSubstring(String s) {
        // leetcode 3
        int maxlen=1;
        int currlen=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                currlen++;
                maxlen = Math.max(maxlen, currlen);
            } else {
                currlen = 1;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        LongestSubStr obj = new LongestSubStr();
        String s = "abcabcbb";
        System.out.println(obj.lengthOfLongestSubstring(s)); // Output: 3
    }
}
