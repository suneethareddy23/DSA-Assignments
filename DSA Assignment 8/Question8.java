package in.ineuron.main;


import java.util.ArrayList;
import java.util.List;

class Solution7 {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        List<Integer> mismatchIndices = new ArrayList<>();
        List<Character> commonCharacters = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                mismatchIndices.add(i);
            } else {
                commonCharacters.add(s.charAt(i));
            }
        }

        if ((mismatchIndices.size() == 0 && hasDuplicates(s)) || (mismatchIndices.size() == 2 &&
                s.charAt(mismatchIndices.get(0)) == goal.charAt(mismatchIndices.get(1)) &&
                s.charAt(mismatchIndices.get(1)) == goal.charAt(mismatchIndices.get(0)))) {
            return true;
        }

        return false;
    }

    private boolean hasDuplicates(String s) {
        boolean[] seen = new boolean[26];
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                return true;
            }
            seen[c - 'a'] = true;
        }
        return false;
    }
}
public class Question8 {
    public static void main(String[] args) {
        String s = "ab";
        String goal = "ba";

        Solution7 solution = new Solution7();
        boolean canSwap = solution.buddyStrings(s, goal);
        System.out.println(canSwap);  // Output: true
    }
}