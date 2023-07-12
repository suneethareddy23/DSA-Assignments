package in.ineuron.main;
import java.util.Stack;

class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '*') {
                stack.push(c);
            } else if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '*') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() == '(') {
                if (!stack.isEmpty() && stack.pop() == '*') {
                    continue;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
public class Question2{
    public static void main(String[] args) {
        String s = "()";

        Solution1 solution = new Solution1();
        boolean isValid = solution.isValid(s);
        System.out.println(isValid);  // Output: true
    }
}