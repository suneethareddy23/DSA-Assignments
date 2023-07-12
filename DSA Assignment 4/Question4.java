package in.ineuron.main;

import java.util.Arrays;

public class Question4 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;

        // Pair the elements starting from the first element in the sorted array
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};

        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);  // Output: 4
    }
}
