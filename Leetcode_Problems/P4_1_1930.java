import java.util.HashSet;

public class P4_1_1930 {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int count = 0;
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0; i<n; i++){
            if(set1.contains(s.charAt(i))==false){
                set1.add(s.charAt(i));
                int j = n-1;
                while(s.charAt(j)!=s.charAt(i)){
                    j--;
                }
                for(int k=i+1; k<j; k++){
                    if(set2.contains(s.charAt(k))==false){
                        count++;
                        set2.add(s.charAt(k));
                    }
                }
                set2.clear();
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        P4_1_1930 solution = new P4_1_1930();
        String s = "bbcbaba";
        System.out.println(solution.countPalindromicSubsequence(s));
    }
}
