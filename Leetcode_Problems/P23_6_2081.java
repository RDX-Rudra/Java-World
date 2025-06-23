import java.util.*;

public class P23_6_2081 {
    public long kMirror(int k, int n) {
        long sum = 0;
        int count = 0;
        int i = 1;

        while (count < n) {
            String baseT = Integer.toString(i);

            if (isPalindrome(baseT)) {
                if( isPalindrome(retBase(i, k))) {
                    sum += i;
                    count++;
                }
            }
            i++;
        }
        return sum;
    }

    private String retBase(int num, int k) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(num % k);
            num /= k;
        }
        return sb.reverse().toString();
    }

    private boolean isPalindrome(String s) {
        int n= s.length();
        if(n==1) return true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P23_6_2081 obj = new P23_6_2081();
        int k = 5; // base
        int n = 20; // number of k-mirror numbers to find
        long result = obj.kMirror(k, n);
        System.out.println("The sum of the first " + n + " k-mirror numbers in base " + k + " is: " + result);
    }
}
