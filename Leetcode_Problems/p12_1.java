import java.util.Arrays;

public class p12_1 {
    public static boolean halvesAreAlike(String s) {
        int len = s.length();
        int mid = len/2;
        int a= 0, b=0;
        for(int i=0; i<mid; i++){
            if(isVowel(s.charAt(i))){
                a ++;
            }
        }
        for(int i=mid; i<len; i++){
            if(isVowel(s.charAt(i))){
                b ++;
            }
        }
        if(a == b){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean isVowel(char letter){
        if(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U').contains(letter)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));

    }
    
}