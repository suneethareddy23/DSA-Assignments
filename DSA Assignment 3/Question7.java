package in.ineuron.main;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<>();

        // Check if lower bound is less than the first element of nums
        if (lower < nums[0]) {
            result.add(formRange(lower, nums[0] - 1));
        }

        // Check for missing ranges between consecutive elements in nums
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1] + 1) {
                result.add(formRange(nums[i - 1] + 1, nums[i] - 1));
            }
        }

        // Check if upper bound is greater than the last element of nums
        if (upper > nums[nums.length - 1]) {
            result.add(formRange(nums[nums.length - 1] + 1, upper));
        }

        return result;
    }

    private static String formRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<String> result = findMissingRanges(nums, lower, upper);
        System.out.println(result);
    }
}