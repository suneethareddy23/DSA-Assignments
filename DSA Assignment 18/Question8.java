package in.ineuron.main;

import java.util.Stack;

 class Solution186 {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int s2 = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] < s2) {
                return true;
            }

            while (!stack.isEmpty() && nums[i] > stack.peek()) {
                s2 = Math.max(s2, stack.pop());
            }

            stack.push(nums[i]);
        }

        return false;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Solution186 solution = new Solution186();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.find132pattern(nums1));  // Output: false

        int[] nums2 = {3, 1, 4, 2};
        System.out.println(solution.find132pattern(nums2));  // Output: true

        int[] nums3 = {-1, 3, 2, 0};
        System.out.println(solution.find132pattern(nums3));  // Output: true
    }
}