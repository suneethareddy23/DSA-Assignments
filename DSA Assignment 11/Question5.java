package in.ineuron.main;
import java.util.*;

public class Question5 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] intersection = findIntersection(nums1, nums2);
        System.out.println("Intersection: " + Arrays.toString(intersection));
    }

    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

      
        for (int num : nums1) {
            set.add(num);
        }

       
        for (int num : nums2) {
            if (set.contains(num)) {
                intersect.add(num);
            }
        }

     
        int[] result = new int[intersect.size()];
        int index = 0;
        for (int num : intersect) {
            result[index++] = num;
        }

        return result;
    }
}