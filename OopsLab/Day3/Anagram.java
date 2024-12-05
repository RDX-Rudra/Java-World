package OopsLab.Day3;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        int count1=0, count2=0, p, q;
        int arr1[] = new int[str1.length()];
        int arr2[] = new int[str1.length()];
        for(int i=0; i<str1.length(); i++){
            p = (int)str1.charAt(i);
            q= (int)str2.charAt(i);
            arr1[i]=p;
            arr2[i]=q;
            count1 += p;
            count2+=q;
            System.out.println(p +"   " + q);
        }
        System.out.println(count1 + "  " + count2);
        if (isAnagram(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


