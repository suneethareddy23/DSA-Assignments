package in.ineuron.main;
import java.util.LinkedList;
import java.util.Queue;

public class Question3 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Question3() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        if (q1.isEmpty())
            throw new IllegalStateException("Stack is empty");

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int poppedElement = q1.remove();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return poppedElement;
    }

    public int top() {
        if (q1.isEmpty())
            throw new IllegalStateException("Stack is empty");

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int topElement = q1.peek();
        q2.add(q1.remove());

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    public boolean isEmpty() {
        return q1.isEmpty() && q2.isEmpty();
    }

    public static void main(String[] args) {
        Question3 stack = new Question3();
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());  // Output: 3
        stack.push(4);
        System.out.println(stack.pop());  // Output: 4
    }
}