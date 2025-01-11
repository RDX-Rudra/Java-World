import java.util.HashMap;

public class P11_1_1400 {
    public boolean canConstruct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c, 1);
            }
            if(map.get(c)%2==0){
                count--;
            }else{
                count++;
            }
        }
        return count<=k && k<=s.length();
    }

    public static void main(String[] args) {
        String s = "annabelle";
        int k = 2;
        P11_1_1400 obj = new P11_1_1400();
        System.out.println(obj.canConstruct(s, k));
    }
}
