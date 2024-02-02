import java.util.ArrayList;
import java.util.List;

public class p2_2 {
    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        String digits = "123456789";

        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        for (int length = lowLength; length <= highLength; length++) {
            for (int start = 0; start <= 9 - length; start++) {
                String numStr = digits.substring(start, start + length);
                int num = Integer.parseInt(numStr);

                if (num >= low && num <= high) {
                    ans.add(num);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int low = 10;
        int high = 300;
        System.out.println(sequentialDigits(low, high));
    }
}
