package in.ineuron.main;
import java.util.Stack;

public class Question5 {
    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        // Pop each character from the stack and append to a new string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }
}