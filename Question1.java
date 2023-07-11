package in.ineuron.main;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> complementMap = new HashMap<>();

       
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];


            if (complementMap.containsKey(complement)) {
                
                return new int[] { complementMap.get(complement), i };
            }

           
            complementMap.put(nums[i], i);
        }

       
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i : result) {
            System.out.print(i + " ");
        }
        
    }
}