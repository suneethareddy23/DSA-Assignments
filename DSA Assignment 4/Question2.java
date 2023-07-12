package in.ineuron.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question2{
    public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Iterate over nums1 and add distinct integers to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Iterate over nums2 and add distinct integers to set2
        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinct1 = new ArrayList<>();
        List<Integer> distinct2 = new ArrayList<>();

        // Find distinct integers in nums1 that are not present in nums2
        for (int num : set1) {
            if (!set2.contains(num)) {
                distinct1.add(num);
            }
        }

        // Find distinct integers in nums2 that are not present in nums1
        for (int num : set2) {
            if (!set1.contains(num)) {
                distinct2.add(num);
            }
        }

        answer.add(distinct1);
        answer.add(distinct2);

        return answer;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);
        System.out.println(distinctIntegers);  // Output: [[1, 3], [4, 6]]
    }
}