package LeetCode_Problems;
import java.util.Stack;;
/**
 * ValidParantheses20
 */
public class ValidParantheses20 {
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // Check for closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty or the top of the stack doesn't match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        // At the end, the stack should be empty if all brackets are matched
        return stack.isEmpty();
    }
     private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String args[]) {
        String s = "{}({)";
        boolean isValid = isValidParentheses(s);
        System.out.println(isValid);
    }
}