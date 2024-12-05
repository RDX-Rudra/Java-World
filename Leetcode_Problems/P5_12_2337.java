public class P5_12_2337 {
    public static boolean canChange(String start, String target) {
        int i = 0, j = 0;
        int n = start.length(), m = target.length();

        // Traverse both strings using two pointers
        while (i < n && j < m) {
            char a = start.charAt(i);
            char b = target.charAt(j);

            // Skip underscores ('_') in both strings
            if (a == '_' && b == '_') {
                i++;
                j++;
            } 
            // Skip underscores in the `start` string
            else if (a == '_') {
                i++;
            } 
            // Skip underscores in the `target` string
            else if (b == '_') {
                j++;
            } 
            // If characters match, ensure valid movement
            else if (
                a == b && // Characters must match
                (
                    (a == 'L' && i >= j) || // 'L' can only move left
                    (a == 'R' && i <= j)    // 'R' can only move right
                )
            ) {
                i++;
                j++;
            } 
            // If none of the above conditions are satisfied, return false
            else {
                return false;
            }
        }

        // Skip remaining underscores in the `start` string
        while (i < n && start.charAt(i) == '_') {
            i++;
        }

        // Skip remaining underscores in the `target` string
        while (j < m && target.charAt(j) == '_') {
            j++;
        }

        // Both pointers must reach the end for a valid transformation
        return i == n && j == m;
    } 

    public static void main(String[] args) {
        String start = "_L__R__R_", target = "L______RR";
        boolean ans = canChange(start, target);
        System.out.println(ans);
    }
}
