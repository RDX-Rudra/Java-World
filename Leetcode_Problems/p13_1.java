
public class p13_1 {
    public static int minSteps(String s, String t) {
        // Initialize a frequency array to track character counts in s
        int[] alphabets = new int[26];
        for (char c : s.toCharArray()) {
            alphabets[c - 'a']++; // Increment count for each character in s
        }
 
        int ans = 0; // Counter for missing characters (deletions needed)
        for (char c : t.toCharArray()) {
            if (alphabets[c - 'a'] == 0) {
                // Character not found in s, increment deletion count
                ans++;
            } else {
                // Character found in s, decrement its count
                alphabets[c - 'a']--;
            }
        }
 
        return ans; // Return the minimum deletion steps
    }
    public static void main(String[] args) {
        String s = "bab";
        String t = "aba";
        System.out.println(minSteps(s, t));
    }
}
