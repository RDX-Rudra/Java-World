
public class p11_3 {
    public static String customSortString(String order, String s) {
        char[] ch1 = order.toCharArray();
        char[] ch2 = s.toCharArray();
        int i=0, j=0;
        StringBuilder sb = new StringBuilder();
        while (i<ch1.length) {
            if(ch1[i] == ch2[j]){
                sb.append(ch1[i]);
                ch2[j] = ' ';
                if(j == ch2.length -1){
                    i++;
                    j=0;
                }
                else
                    j++;
            }else if(j== ch2.length -1){
                i++;
                j=0;
            }
            else{
                j++;
            }
        }
        for (char c : ch2) {
            if(c != ' ') {
                sb.append(c);
            }
        }
        String result = sb.toString();
        return result;
    }
    public static void main(String args[]){
        String order = "kqep", s = "pekeq";
        System.out.println(customSortString(order, s));
    }
}
