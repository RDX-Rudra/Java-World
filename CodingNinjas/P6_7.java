

public class P6_7 {
    public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
        StringBuilder res = new StringBuilder();
        String str1 = str.toString();
        for (int i = 0; i < str1.length(); i++) {
            char a = str1.charAt(i);
            if(a == ' ')
                res.append("@40");
            else
                res.append(a);
        
        }
        return res;
	}

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Coding Ninjas Is A Coding Platform");
        System.out.println(replaceSpaces(str).toString());
    }
}
