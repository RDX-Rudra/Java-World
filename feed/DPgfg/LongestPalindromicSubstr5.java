public class LongestPalindromicSubstr5 {
    
    /**
     * Finds the longest palindromic substring using expand around center approach
     * Time Complexity: O(n^2), Space Complexity: O(1)
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        
        int start = 0;
        int maxLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes (single character center)
            int len1 = expandAroundCenter(s, i, i);
            // Check for even-length palindromes (two character center)
            int len2 = expandAroundCenter(s, i, i + 1);
            
            int len = Math.max(len1, len2);
            
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1) / 2;
            }
        }
        
        return s.substring(start, start + maxLen);
    }
    
    /**
     * Helper method to expand around center and count palindrome length
     */
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return length of palindrome
        return right - left - 1;
    }
    
    public static void main(String[] args) {
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "a";
        String test4 = "ac";
        String test5 = "racecar";
        
        System.out.println("Input: \"" + test1 + "\" -> Output: \"" + longestPalindrome(test1) + "\"");
        System.out.println("Input: \"" + test2 + "\" -> Output: \"" + longestPalindrome(test2) + "\"");
        System.out.println("Input: \"" + test3 + "\" -> Output: \"" + longestPalindrome(test3) + "\"");
        System.out.println("Input: \"" + test4 + "\" -> Output: \"" + longestPalindrome(test4) + "\"");
        System.out.println("Input: \"" + test5 + "\" -> Output: \"" + longestPalindrome(test5) + "\"");
    }
}
