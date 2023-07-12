package in.ineuron.main;


import java.util.Arrays;

public class Question3 {

	public static int[] squareNumber(int[] nums) {
       
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		return nums;
    }

    public static void main(String[] args) {
        
        int  nums[] = {-4,-1,0,3,10};
        int[] result = squareNumber(nums);
        
        System.out.println(Arrays.toString(result));
    }
}
