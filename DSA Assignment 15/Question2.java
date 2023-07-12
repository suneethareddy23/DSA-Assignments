package in.ineuron.main;
import java.util.Arrays;
import java.util.Stack;

public class Question2 {
    public static int[] findNearestSmallerElement(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.empty() && stack.peek() >= arr[i]) {
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
        int[] arr = {1, 6, 2};
        int[] result = findNearestSmallerElement(arr);
        System.out.println(Arrays.toString(result));  // Output: [-1, 1, 1]
    }
}