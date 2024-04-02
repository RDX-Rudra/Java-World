import java.util.HashMap;

public class P2_4_205 {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> store = new HashMap<>();
        if(s.length() != t.length())
            return false;
        else{
            for(int i=0; i<s.length(); i++){
                char charS = s.charAt(i);
                char charT = t.charAt(i);
                if(!store.containsKey(charS)) {
                    if(store.containsValue(charT)) 
                        return false;
                    store.put(charS, charT);
                }
                else{
                    if(store.get(charS) != charT)
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s, t));
    }
}
