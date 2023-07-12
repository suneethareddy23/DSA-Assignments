package in.ineuron.main;

import java.util.Arrays;

public class Question5 {

	public static int minimumProductSum(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int minProductSum = 0;
        int n = nums1.length;

        for (int i = 0; i < n; i++) {
            minProductSum += nums1[i] * nums2[n - 1 - i];
        }

        return minProductSum;
    }
	
	public static void main(String[] args) {
		int[]  nums1 = {5,3,4,2}, nums2 = {4,2,2,5};
		
		int minimumProductSum = minimumProductSum(nums1, nums2);
		System.out.println(minimumProductSum);
	}
}
