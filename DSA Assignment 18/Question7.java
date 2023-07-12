package in.ineuron.main;
import java.util.*;
class Solution185 {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }

        return maxLength;
    }
}

public class Question7 {
    public static void main(String[] args) {
        Solution185 solution = new Solution185();

        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int length1 = solution.lengthOfLIS(nums1);
        System.out.println(length1);
        // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int length2 = solution.lengthOfLIS(nums2);
        System.out.println(length2);
        // Output: 4

        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};
        int length3 = solution.lengthOfLIS(nums3);
        System.out.println(length3);
        // Output: 1
    }
}