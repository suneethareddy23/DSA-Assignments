package in.ineuron.main;

import java.util.HashSet;

public class Question8 {
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate = -1;
        int missing = -1;

       
        HashSet<Integer> set = new HashSet<>();

        
        for (int num : nums) {
            if (set.contains(num)) {
                duplicate = num;
            } else {
                set.add(num);
            }
        }

      
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };
        int[] result = findErrorNums(nums);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]"); // Output: Result: [2, 3]
    }
}