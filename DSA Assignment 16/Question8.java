package in.ineuron.main;

import java.util.Stack;

public class Question8{

    public static int maxAbsoluteDifference(int[] array) {
        int n = array.length;
        int[] leftNSE = new int[n];
        int[] rightNSE = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Find Next Smaller Element (NSE) indices for the left side
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) {
                stack.pop();
            }
            leftNSE[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
            stack.push(i);
        }

        stack.clear();

        // Find Next Smaller Element (NSE) indices for the right side
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && array[stack.peek()] >= array[i]) {
                stack.pop();
            }
            rightNSE[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        int maxDiff = 0;

        // Calculate maximum absolute difference
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(rightNSE[i] - leftNSE[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 1, 8};
        int maxDiff1 = maxAbsoluteDifference(array1);
        System.out.println("Maximum absolute difference: " + maxDiff1);
        // Output: Maximum absolute difference: 1

        int[] array2 = {3, 5, 1, 2, 6, 4};
        int maxDiff2 = maxAbsoluteDifference(array2);
        System.out.println("Maximum absolute difference: " + maxDiff2);
        // Output: Maximum absolute difference: 5
    }
}