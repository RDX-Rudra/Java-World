/**
 * This program prompts the user to enter their full name and then prints the initials of the name.
 * Each initial is followed by a period.
 * 
 * Example:
 * Input: John Doe
 * Output: J.D.
 * 
 * Steps:
 * 1. The program reads the full name from the user input.
 * 2. It splits the name into individual words.
 * 3. It extracts the first character of each word, converts it to uppercase, and appends a period.
 * 4. It removes the trailing period if present.
 * 5. It prints the initials.
 * 
 * Question:
 * How does the program handle multiple spaces between words in the input name?
 */
package OopsLab.day4;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter full name");
        String name= scanner.nextLine();
        String[] words=name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String word:words){
            if (!word.isEmpty()) {
                initials.append(Character.toUpperCase(word.charAt(0))).append(".");
            }
        }
        if (initials.length() > 0 && initials.charAt(initials.length() - 1) == '.') {
            initials.setLength(initials.length() - 1);
        }
        System.out.println("PrintInitials:" + initials.toString());
        scanner.close();
    }
}
