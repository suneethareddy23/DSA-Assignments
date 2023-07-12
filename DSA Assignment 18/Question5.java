package in.ineuron.main;
import java.util.HashSet;
import java.util.Set;

 class Solution183 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Solution183 solution = new Solution183();

        int[] nums1 = {1, 2, 3, 1};
        boolean containsDuplicate1 = solution.containsDuplicate(nums1);
        System.out.println(containsDuplicate1);
        // Output: true

        int[] nums2 = {1, 2, 3, 4};
        boolean containsDuplicate2 = solution.containsDuplicate(nums2);
        System.out.println(containsDuplicate2);
        // Output: false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean containsDuplicate3 = solution.containsDuplicate(nums3);
        System.out.println(containsDuplicate3);
        // Output: true
    }
}