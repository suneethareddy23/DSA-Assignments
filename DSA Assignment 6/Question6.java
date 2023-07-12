package in.ineuron.main;


import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {

	public static  int[] findOriginalArray(int[] nums) {
        if (nums.length % 2 != 0) {
            return new int[0];
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : nums) {
            if (countMap.containsKey(num) && countMap.get(num) > 0) {
                int doubleNum = 2 * num;
                if (countMap.containsKey(doubleNum) && countMap.get(doubleNum) > 0) {
                    originalList.add(num);
                    countMap.put(num, countMap.get(num) - 1);
                    countMap.put(doubleNum, countMap.get(doubleNum) - 1);
                } else {
                    return new int[0];
                }
            }
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }
     public static void main(String[] args) {
		int[] nums= {1,3,4,2,6,8};
		int[] result = findOriginalArray(nums);
		System.out.println(Arrays.toString(result));
    	 
	}
}