package in.ineuron.main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution5 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> pMap = new HashMap<>();
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> sMap = new HashMap<>();
        int left = 0;
        int right = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            sMap.put(rightChar, sMap.getOrDefault(rightChar, 0) + 1);

            if (right - left + 1 == p.length()) {
                if (pMap.equals(sMap)) {
                    result.add(left);
                }

                char leftChar = s.charAt(left);
                sMap.put(leftChar, sMap.get(leftChar) - 1);
                if (sMap.get(leftChar) == 0) {
                    sMap.remove(leftChar);
                }

                left++;
            }

            right++;
        }

        return result;
    }
}
public class Question6 {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        Solution5 solution = new Solution5();
        List<Integer> startIndices = solution.findAnagrams(s, p);
        System.out.println(startIndices);  // Output: [0, 6]
    }
}