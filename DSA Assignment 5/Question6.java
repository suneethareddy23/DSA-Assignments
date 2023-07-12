package in.ineuron.main;


import java.util.ArrayList;
import java.util.List;

public class Question6 {

	 public static List<Integer> findDuplicatesForTwoTimes(int[] nums) {
	        List<Integer> duplicates = new ArrayList<>();

	        for (int i = 0; i < nums.length; i++) {
	            int index = Math.abs(nums[i]) - 1;
	            if (nums[index] < 0) {
	                duplicates.add(Math.abs(nums[i]));
	            } else {
	                nums[index] = -nums[index];
	            }
	        }

	        for (int i = 0; i < nums.length; i++) {
	            nums[i] = Math.abs(nums[i]);
	        }

	        return duplicates;
	    }

	    public static void main(String[] args) {
	       
	        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
	        List<Integer> result = findDuplicatesForTwoTimes(nums);
	        System.out.println(result);
	    }
}