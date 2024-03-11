public class AltrP_11_3 {
    public static String customSortString(String order, String s) {
        char[] ch1 = order.toCharArray();
        char[] ch2 = s.toCharArray();
        int[] count = new int[26]; // Assuming only lowercase letters
        
        // Count the occurrences of each character in s
        for (char c : ch2) {
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        // Append characters from order according to their occurrences in s
        for (char c : ch1) {
            while (count[c - 'a']-- > 0) {
                sb.append(c);
            }
        }
        
        // Append remaining characters from s that are not in order
        for (char c : ch2) {
            if (count[c - 'a'] > 0) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String args[]){
        String order = "bcafg", s = "sbcd";
        System.out.println(customSortString(order, s)); // Output: "bbccdsf"
    }
}
