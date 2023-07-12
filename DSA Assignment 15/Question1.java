package in.ineuron.main;
import java.util.Arrays;
import java.util.Stack;

public class Question1 {
    public static int[] findNextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        int[] result = findNextGreaterElement(arr);
        System.out.println(Arrays.toString(result));  // Output: [3, 4, 4, -1]
    }
}