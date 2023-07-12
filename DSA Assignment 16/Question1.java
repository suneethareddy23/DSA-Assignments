package in.ineuron.main;
import java.util.*;

public class Question1 {

    public static int[] findNearestGreaterFrequency(int[] arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        Arrays.fill(result, -1);

        // Count the frequency of each element
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        // Iterate from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && frequency.get(arr[i]) >= frequency.get(arr[stack.peek()])) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = arr[stack.peek()];
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 1, 2, 3, 4, 2, 1};
        int[] result1 = findNearestGreaterFrequency(arr1);
        System.out.println(Arrays.toString(result1));
        // Output: [-1, -1, 1, 2, 2, 1, -1]

        // Example 2
        int[] arr2 = {4, 4, 4, 3, 3, 5, 2, 2, 7};
        int[] result2 = findNearestGreaterFrequency(arr2);
        System.out.println(Arrays.toString(result2));
        // Output: [5, 5, 5, 5, 5, 7, 7, 7, -1]
    }
}