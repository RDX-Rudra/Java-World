public class P3_12 {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int p=0;
        int n= s.length();
        for(int i=0; i<n; i++){
            if(p<spaces.length && spaces[p] == i){
                ans.append(" ");
                ans.append(s.charAt(i));
                p++;
            }
            else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int spaces[] = {8,13,15};
        String ans = addSpaces(s, spaces);
        System.out.println(ans);
    }
}
