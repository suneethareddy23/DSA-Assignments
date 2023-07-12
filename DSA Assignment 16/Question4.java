package in.ineuron.main;
import java.util.*;

public class Question4
{
    
    public static String canArrangeInOrder(int[] queue) {
        int n = queue.length;
        Queue<Integer> givenQueue = new LinkedList<>();
        Queue<Integer> secondQueue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            givenQueue.add(queue[i]);
        }

        for (int i = 1; i <= n; i++) {
            if (!givenQueue.isEmpty() && givenQueue.peek() == i) {
                secondQueue.add(givenQueue.poll());
            } else {
                if (!stack.isEmpty() && stack.peek() == i) {
                    secondQueue.add(stack.pop());
                    i--;
                } else {
                    stack.push(givenQueue.poll());
                }
            }
        }

        while (!givenQueue.isEmpty()) {
            secondQueue.add(givenQueue.poll());
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == secondQueue.peek()) {
                secondQueue.add(stack.pop());
                secondQueue.poll();
            } else {
                return "No";
            }
        }

        for (int i = 2; i <= n; i++) {
            if (secondQueue.poll() != i) {
                return "No";
            }
        }

        return "Yes";
    }

    public static void main(String[] args) {
        // Example 1
        int[] queue1 = {5, 1, 2, 3, 4};
        String result1 = canArrangeInOrder(queue1);
        System.out.println("Result: " + result1);
        // Output: Result: Yes

        // Example 2
        int[] queue2 = {5, 1, 2, 6, 3, 4};
        String result2 = canArrangeInOrder(queue2);
        System.out.println("Result: " + result2);
    }
}