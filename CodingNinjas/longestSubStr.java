import java.util.HashMap;

public class longestSubStr {
    public static int uniqueSubstrings(String input) 
    {
		//write your code here
		int l = input.length();
		int maxlen = 0;
		int start = 0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int end =0; end <l; end++){
			char c = input.charAt(end);
			if(map.containsKey(c)){
				start = Math.max(map.get(c) +1, start);
			}
			map.put(c, end);
			maxlen = Math.max(maxlen, end - start+1);
		}
		return maxlen;
	}

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(uniqueSubstrings(s));
    }
}
