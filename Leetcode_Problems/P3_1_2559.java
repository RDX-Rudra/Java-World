public class P3_1_2559 {
    public static int[] vowelStrings(String[] words, int[][] queries) {
        int[] arr = new int[words.length +1];
        arr[0] = 0;
        int[] result = new int[queries.length];
        for(int i = 0; i < words.length; i++) {
            if(isVowelString(words[i])) {
                arr[i+1] = arr[i]+1;
            }
            else {
                arr[i+1] = arr[i];
            }
        }
        for(int i = 0; i < queries.length; i++) {
            int count = 0;
            count = arr[queries[i][1]+1] - arr[queries[i][0]];
            result[i] = count;
        }
        return result;
    }

    public static boolean isVowelString(String str) {
        return isVowel(str.charAt(0)) && isVowel(str.charAt(str.length()-1));
    }
    public static boolean isVowel(char ch) {
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }

    public static void main(String[] args) {
        String[] words = {"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = {{0, 2}, {1, 4}, {1, 1}};
        int[] result = vowelStrings(words, queries);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
