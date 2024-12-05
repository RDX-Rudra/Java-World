package OopsLab.Day3;

public class EqualSubStr {
    public static void main(String[] args) {
        String str = "102100211";
        System.out.println("Output: " + countEqual012Substrings(str));
    }

    public static int countEqual012Substrings(String str) {
        int n = str.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int count0 = 0, count1 = 0, count2 = 0;
            for (int j = i; j < n; j++) {
                if (str.charAt(j) == '0') count0++;
                else if (str.charAt(j) == '1') count1++;
                else if (str.charAt(j) == '2') count2++;

                if (count0 == count1 && count1 == count2) {
                    result++;
                }
            }
        }
        return result;
    }
}
