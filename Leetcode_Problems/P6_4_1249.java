import java.util.Stack;

public class P6_4_1249 {
    public static String minRemoveToMakeValid(String s) {
        Stack<Character> store = new Stack<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == '(')
                store.push(arr[i]);
            if(arr[i] == ')'){
                if(!store.isEmpty()){
                    store.pop();
                }
                else{
                    arr[i] = ' ';
                }
            }
        }
        while()
        StringBuilder result = new StringBuilder();
        for(char c : arr){
            if(c == ' ')
                continue;
            else
                result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";
        System.out.println(minRemoveToMakeValid(s));
    }
}
