package in.ineuron.main;
import java.util.*;

public class Question2 {

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        // Example 1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(5);
        stack1.push(2);
        stack1.push(7);
        stack1.push(1);
        stack1.push(3);

        sortStack(stack1);
        System.out.println("Sorted stack: " + stack1);
        // Output: Sorted stack: [1, 2, 3, 5, 7]

        // Example 2
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(9);
        stack2.push(4);
        stack2.push(6);
        stack2.push(1);
        stack2.push(5);

        sortStack(stack2);
        System.out.println("Sorted stack: " + stack2);
        // Output: Sorted stack: [1, 4, 5, 6, 9]
    }
}