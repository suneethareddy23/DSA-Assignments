package in.ineuron.main;

public class Question2 {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // Number of elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println("k = " + result); // Output: k = 2

        // Print the modified array nums
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
        // Output: 2 2
    }
}