package in.ineuron.main;
import java.util.Stack;
class Solution6 {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int currentCount = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                currentCount = currentCount * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString);
                currentCount = 0;
                currentString = "";
            } else if (c == ']') {
                int count = countStack.pop();
                StringBuilder decodedString = new StringBuilder(stringStack.pop());
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString.toString();
            } else {
                currentString += c;
            }
        }

        return currentString;
    }
}
public class Question7 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";

        Solution6 solution = new Solution6();
        String decodedString = solution.decodeString(s);
        System.out.println(decodedString);  // Output: "aaabcbc"
    }
}