public class p13_2 {
    public static String firstPalindrome(String[] words) {
        for(String word : words) {
            int n = word.length();
            int j = 0;
            while (j < n / 2) {
                if (word.charAt(j) != word.charAt(n - 1 - j)) {
                    break;
                }
                j++;
            }
            if (j >= n / 2) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));
    }
}
