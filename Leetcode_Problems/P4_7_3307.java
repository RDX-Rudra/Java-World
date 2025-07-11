public class P4_7_3307 {
    public char kthCharacter(long k, int[] operations) {
        long len=1;
        for (int op : operations) {
            if (op == 0) {
                len *= 2;
            } else {
                len += word.length();
            }
            if (k <= len) {
                return word.charAt((int)(k - 1));
            }
        }

        // If we still don't have enough characters
        return ' ';
    }

    public static void main(String[] args) {
        P4_7_3307 obj = new P4_7_3307();
        long k = 12286162;  
        int[] operations = {1,0,1,1,0,0,0,1,1,1,0,1,0,0,0,0,1,0,0,1,0,0,1,0,0};
        System.out.println(obj.kthCharacter(k, operations)); // Expected: 'e'
    }
}
