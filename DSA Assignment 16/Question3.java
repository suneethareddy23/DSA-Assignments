package in.ineuron.main;
import java.util.Stack;

public class Question3 {
    
    public static void deleteMiddle(Stack<Integer> stack, int size, int current) {
        // Base case: stack is empty or current index is middle index
        if (stack.isEmpty() || current == size/2) {
            stack.pop();
            return;
        }
        
        // Pop an element and call the recursive function with incremented index
        int temp = stack.pop();
        deleteMiddle(stack, size, current + 1);
        
        // Push the popped element back onto the stack
        stack.push(temp);
    }
    
    public static void deleteMiddleElement(Stack<Integer> stack) {
        int size = stack.size();
        deleteMiddle(stack, size, 0);
    }

    public static void main(String[] args) {
        // Example 1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        
        deleteMiddleElement(stack1);
        System.out.println("Modified stack: " + stack1);
        // Output: Modified stack: [1, 2, 4, 5]
        
        // Example 2
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        
        deleteMiddleElement(stack2);
        System.out.println("Modified stack: " + stack2);
        // Output: Modified stack: [1, 2, 4, 5, 6]
    }
}