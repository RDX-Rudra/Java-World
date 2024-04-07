import java.util.Stack;

public class P7_4_678 {
    public static boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(')
                leftStack.push(i);
            else if (c == '*')
                starStack.push(i);
            else {
                if (!leftStack.isEmpty())
                    leftStack.pop();
                else if (!starStack.isEmpty())
                    starStack.pop();
                else
                    return false;
            }
        }

        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            if (leftStack.pop() > starStack.pop())
                return false;
        }

        return leftStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        System.out.println(checkValidString(s));
    }
}
