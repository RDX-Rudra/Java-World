import java.util.ArrayList;
import java.util.List; // Import List interface for better type safety

public class p30_1 {

    public static boolean is_oper(String ele) {
        // Use equals method for string comparison
        return ele.equals("+") || ele.equals("-") || ele.equals("*") || ele.equals("/");
    }

    public static int evalRPN(String[] tokens) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < tokens.length; i++) {
            // Use get method to access elements from the list
            if (is_oper(tokens[i])) {
                int a = Integer.parseInt(result.get(result.size() - 2));
                int b = Integer.parseInt(result.get(result.size() - 1));

                int res;
                if (tokens[i].equals("+")) {
                    res = a + b;
                } else if (tokens[i].equals("-")) {
                    res = a - b;
                } else if (tokens[i].equals("*")) {
                    res = a * b;
                } else {
                    res = a / b;
                }

                // Modify the list manipulation logic
                result.remove(result.size() - 1);
                result.remove(result.size() - 1);
                result.add(Integer.toString(res));
            } else {
                result.add(tokens[i]);
            }
        }

        // Return the final result
        return Integer.parseInt(result.get(0));
    }

    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = evalRPN(tokens);
        System.out.println("Result: " + result);
    }
}
