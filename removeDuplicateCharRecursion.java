import java.util.*;

public class removeDuplicateCharRecursion{
    public static boolean[] map = new boolean[26];
    public static void removeDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){ //== true
            removeDuplicate(str, idx+1, newString);
        }
        else{
            newString+= currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeDuplicate(str, 0, "");
    }
}