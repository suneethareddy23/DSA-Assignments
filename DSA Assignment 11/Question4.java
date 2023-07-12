package in.ineuron.main;
public class Question4 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int repeatedNumber = findDuplicate(nums);
        System.out.println("Repeated number: " + repeatedNumber);
    }

    public static int findDuplicate(int[] nums) {
        // Find the intersection point of the two pointers
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Move one pointer to the start and keep the other at the intersection point
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}





