package in.ineuron.main;

import java.util.HashMap;

public class Question4 {

	public static int findMaxLength(int[] nums) {
        int maxLen = 0;
        int count = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 1 ? 1 : -1;
            
            if (!countMap.containsKey(count)) {
                countMap.put(count, i);
            } else {
                maxLen = Math.max(maxLen, i - countMap.get(count));
            }
        }

        return maxLen;
    }

	public static void main(String[] args)
	{
		int nums[]= {0,1};
		System.out.println(findMaxLength(nums));
	}
}

