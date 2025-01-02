package OopsLab.day4;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string");
        String input= scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str) {
        str=str.replaceAll("\\s+","").toLowerCase();
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }            
}
