package AmazonSpringHigh;

import java.util.HashMap;

public class OptimalPartiStr2405 {
    public static int partitionString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count=1;
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))==null)
                map.put(s.charAt(i), 1);
            else{
                count++;
                map.clear();
                map.put(s.charAt(i), 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s="abacaba";
        int ans = partitionString(s);
        System.out.println(ans);
    }
}
