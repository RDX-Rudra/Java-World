import java.util.Stack;

public class P7_4_678 {
    public static boolean checkValidString(String s) {
        Stack<Character> stack = new Stack<>();
        int stars = 0;
        for(char c : s.toCharArray()){
            if(c== '(')
                stack.push(c);
            else if(c== '*'){
                
                stars++;
            }
            else if(c == ')'){
                if(!stack.isEmpty())
                    stack.pop();
                else if(stars >0 && stack.isEmpty())
                    stars--;
                else
                    return false;
            }
            else
                continue;
        }
        while(!stack.isEmpty()){
            if(stars>0)
                stars--;
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        System.out.println(checkValidString(s));
    }
}
