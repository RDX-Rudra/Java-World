public class p20_9_214 {
    public static String shortestPalindrome(String s) {    
        StringBuilder t = new StringBuilder();
        int i=0, j=s.length()-1, count=0;
        while(i<=j){
            // System.out.print(i );
            // System.out.println(j);
            if(s.charAt(i) != s.charAt(j)){
                count=s.length()-j;
                System.out.println(count);
                j--;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println(i-1);
        System.out.println(s.length()-count-1);
        if(count!=0){
            if(s.charAt(i) == s.charAt(i-1)){
                t.append(s.substring(i-1, s.length())).reverse();
                t.append(s.substring(i-1, s.length()));
            }
            else{
                t.append(s.substring(i-1, s.length())).reverse();
                t.append(s.substring(i, s.length()));
            }
            return t.toString();
        }
        else
            return s;
    }
    public static void main(String[] args) {
        String s= "ba";
        String res = shortestPalindrome(s);
        System.out.println(res);
        String s1= "aabba";
        String res1 = shortestPalindrome(s1);
        System.out.println(res1);
    }
}
