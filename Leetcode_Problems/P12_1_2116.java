public class P12_1_2116 {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if (n % 2 != 0) {
            return false;
        }
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '1') {
                if (s.charAt(i) == '(') {
                    lower++;
                    upper++;
                } else {
                    lower--;
                    upper--;
                }
            } else {
                upper++;
                lower--;
            }
            if (lower < 0) {
                lower += 2;
            }
            if (upper < 0) {
                return false;
            }
        }
        return lower == 0;
    }

    public static void main(String[] args) {
        String s = "(()))";
        String locked = "10000";
        P12_1_2116 obj = new P12_1_2116();
        System.out.println(obj.canBeValid(s, locked));
    }
}
