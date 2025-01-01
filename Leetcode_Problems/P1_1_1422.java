public class P1_1_1422 {
    public static int maxScore(String s) {
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        
        int ans = 0;
        int zeros = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                ones--;
            } else {
                zeros++;
            }
            
            ans = Math.max(ans, zeros + ones);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
}
