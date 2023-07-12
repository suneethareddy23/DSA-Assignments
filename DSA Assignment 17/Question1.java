package in.ineuron.main;
import java.util.HashMap;
import java.util.Map;

public class Question1 {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find the first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // Step 3: If no non-repeating character is found
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));  // Output: 0
        System.out.println(firstUniqChar("loveleetcode"));  // Output: 2
    }
}