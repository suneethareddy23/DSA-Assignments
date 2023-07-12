package in.ineuron.main;
public class Question6 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        int minElement = findMin(nums);
        System.out.println("Minimum element: " + minElement);
    }

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // If the array is not rotated
        if (nums[left] < nums[right]) {
            return nums[left];
        }

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                
                left = mid + 1;
            } else {
               
                right = mid;
            }
        }

        return nums[left];
    }
}