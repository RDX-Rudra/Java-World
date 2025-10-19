public class P19_10_1625 {
    private String addOp(String s, int a){
        StringBuilder sb = new StringBuilder<>();
        for(int i=0; i<s.length; i++){
            if(i%2!=0)
                sb.append(((s.charAt(i)-'0') + a )%10);
            else
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private String rotateOp(String s, int b){
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0; i<)
    }
    public String findLexSmallestString(String s, int a, int b) {
        
    }
}
