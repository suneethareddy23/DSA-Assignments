package in.ineuron.main;
import java.util.Stack;

public class Question7 {

    public static int countWordsLeft(String sequence) {
        String[] words = sequence.split(" ");
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            if (!stack.isEmpty() && word.equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(word);
            }
        }

        return stack.size();
    }

    public static void main(String[] args) {
        String sequence1 = "ab aa aa bcd ab";
        int wordsLeft1 = countWordsLeft(sequence1);
        System.out.println("Number of words left: " + wordsLeft1);
        // Output: Number of words left: 3

        String sequence2 = "tom jerry jerry tom";
        int wordsLeft2 = countWordsLeft(sequence2);
        System.out.println("Number of words left: " + wordsLeft2);
        // Output: Number of words left: 0
    }
}