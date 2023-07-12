package in.ineuron.main;


public class Question7 {

	  public static int findMinimum(int[] nums)
	  {
	        int left = 0;
	        int right = nums.length - 1;

	        while (left < right) {
	            int mid = (left + right) / 2;

	            if (nums[mid] > nums[right]) {
	                left = mid + 1;
	            } else {
	                right = mid;
	            }
	        }

	        return nums[left];
	    }

	    public static void main(String[] args) {
	    	int[] nums = {3, 4, 5, 1, 2};
	        int result = findMinimum(nums);
	        System.out.println("Minimum element: " + result);
	    }
}