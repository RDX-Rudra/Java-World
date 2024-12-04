public class P4_12 {
    public static boolean canMakeSubsequence(String str1, String str2) {
        int n = str1.length();
        int p=0;
        for(int i=0; i<n; i++){
            if(p<str2.length()){
                if(str1.charAt(i)==str2.charAt(p)){
                    p++;
                }
                else if(97 + (((int)str1.charAt(i) + 1 - 97) % 26)
                == (int)str2.charAt(p)){
                    p++;
                }
            }
        }
        return p == str2.length();
    }

    public static void main(String[] args) {
        String str1 = "zc";
        String str2 = "ad";
        boolean ans = canMakeSubsequence(str1, str2);
        System.out.println(ans);
    }
}
