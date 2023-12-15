import java.util.Arrays;

public class StringLinearSearch {
    public static void main(String[] args) {
        String str = "avon";
        char target = 'o';
        System.out.println(search(str, target));
        System.out.println(search1(str, target));
        System.out.println(str);
        System.out.println(str.toCharArray());
        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search1(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i< str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
