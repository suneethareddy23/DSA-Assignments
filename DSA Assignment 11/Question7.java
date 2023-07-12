package in.ineuron.main;
import java.util.Arrays;

public class Question7{
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("Range: " + Arrays.toString(result));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};

      
        int leftIndex = binarySearch(nums, target, true);
        if (leftIndex == nums.length || nums[leftIndex] != target) {
            
            return range;
        }

       
        int rightIndex = binarySearch(nums, target, false) - 1;

        range[0] = leftIndex;
        range[1] = rightIndex;

        return range;
    }

    public static int binarySearch(int[] nums, int target, boolean left) {
        int low = 0;
        int high = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > target || (left && nums[mid] == target)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}