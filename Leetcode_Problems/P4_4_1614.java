import java.util.Stack;

public class P4_4_1614 {
    public static int maxDepth(String s) {
        Stack<Character> store = new Stack<>();
        int maxdept = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                store.push(s.charAt(i));
                count++;
                maxdept = Math.max(maxdept, count);
            }
            else if(s.charAt(i)==')'){
                store.pop();
                count--;
            }
            else
                continue;
        }
        return maxdept;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
}
