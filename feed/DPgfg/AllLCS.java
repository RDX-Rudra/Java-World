import java.util.*;

public class AllLCS {

    public ArrayList<String> allLCS(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        // dp[i][j] = LCS length of s1[i...] and s2[j...]
        int[][] dp = new int[n + 1][m + 1];

        // Build DP table
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(
                        dp[i + 1][j],
                        dp[i][j + 1]
                    );
                }
            }
        }

        // TreeSet automatically removes duplicates
        // and keeps results sorted
        TreeSet<String> set = new TreeSet<>();

        generate(
            0,
            0,
            s1,
            s2,
            dp,
            new StringBuilder(),
            set
        );

        return new ArrayList<>(set);
    }

    private void generate(
            int i,
            int j,
            String s1,
            String s2,
            int[][] dp,
            StringBuilder sb,
            TreeSet<String> result) {

        // LCS completed
        if (dp[i][j] == 0) {
            result.add(sb.toString());
            return;
        }

        // Characters match
        if (s1.charAt(i) == s2.charAt(j)) {

            sb.append(s1.charAt(i));

            generate(
                i + 1,
                j + 1,
                s1,
                s2,
                dp,
                sb,
                result
            );

            // Backtrack
            sb.deleteCharAt(sb.length() - 1);

        } else {

            // Move down if it can still produce
            // an LCS of maximum length
            if (dp[i + 1][j] == dp[i][j]) {
                generate(
                    i + 1,
                    j,
                    s1,
                    s2,
                    dp,
                    sb,
                    result
                );
            }

            // Move right if it can still produce
            // an LCS of maximum length
            if (dp[i][j + 1] == dp[i][j]) {
                generate(
                    i,
                    j + 1,
                    s1,
                    s2,
                    dp,
                    sb,
                    result
                );
            }
        }
    }

    public static void main(String[] args) {

        AllLCS obj = new AllLCS();

        String s1 = "abaaa";
        String s2 = "baabaca";

        ArrayList<String> result = obj.allLCS(s1, s2);

        System.out.println(result);
    }
}