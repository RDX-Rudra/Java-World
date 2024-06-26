import java.util.Arrays;

public class p14_1 {
    public static boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 == len2){
            int[] alphabets1 = new int[26];
            int[] alphabets2 = new int[26];
            for (int i = 0; i < len1; i++) {
                alphabets1[word1.charAt(i) - 'a']++;
                alphabets2[word2.charAt(i) - 'a']++;
            }
            for (int i = 0; i < 26; i++) {
                if ((alphabets1[i] == 0 && alphabets2[i] != 0) || (alphabets1[i] != 0 && alphabets2[i] == 0)) {
                    return false;
                }
            }
            Arrays.sort(alphabets1);
            Arrays.sort(alphabets2);
            if(Arrays.equals(alphabets1, alphabets2))
                return true;
            else
                return false;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "aadfg";
        String t = "gfdbb";
        System.out.println(closeStrings(s, t));
    }
}
