package in.ineuron.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {

	public static List<Integer> findOriginalArray(int[] changed) {
        List<Integer> original = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

       
        for (int num : changed) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : changed) {
            if (countMap.getOrDefault(num, 0) == 0) {
                continue; // Skip elements that have already been used
            }

            if (countMap.getOrDefault(2 * num, 0) == 0) {
                return new ArrayList<>(); // Not a doubled array, return empty array
            }

            original.add(num);

            countMap.put(num, countMap.get(num) - 1);
            countMap.put(2 * num, countMap.get(2 * num) - 1);
        }

        for (int count : countMap.values()) {
            if (count != 0) {
                return new ArrayList<>(); // Not a doubled array, return empty array
            }
        }

        return original;
    }

    public static void main(String[] args) {
 
        int[] changed = {1, 3, 4, 2, 6, 8};
        List<Integer> result = findOriginalArray(changed);
        System.out.println(result);
    }

}