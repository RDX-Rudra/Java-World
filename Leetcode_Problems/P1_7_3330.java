public class P1_7_3330 {
    public int possibleStringCount(String word) {
        int res=0;
        for(int i=1; i<word.length(); i++) {
            if(word.charAt(i) == word.charAt(i-1)) {
                res++;
            }
        }
        return res+1;
    }

    public static void main(String[] args) {
        P1_7_3330 obj = new P1_7_3330();
        String word = "abbcccc";
        System.out.println(obj.possibleStringCount(word)); // Output: 5
    }
}
