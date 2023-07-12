package in.ineuron.main;
import java.util.*;

public class Question5 {

    public static int reverseNumber(int number) {
        String numberStr = String.valueOf(number);
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < numberStr.length(); i++) {
            stack.push(numberStr.charAt(i));
        }

        StringBuilder reversedStr = new StringBuilder();

        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        return Integer.parseInt(reversedStr.toString());
    }

    public static void main(String[] args) {
        // Example 1
        int number1 = 12345;
        int reversedNumber1 = reverseNumber(number1);
        System.out.println("Reversed number: " + reversedNumber1);
        // Output: Reversed number: 54321

        // Example 2
        int number2 = 987654321;
        int reversedNumber2 = reverseNumber(number2);
        System.out.println("Reversed number: " + reversedNumber2);
        // Output: Reversed number: 123456789
    }
}