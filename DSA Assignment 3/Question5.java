package in.ineuron.main;

import java.util.Arrays;

public class Question5 {
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;

            if (carry == 0) {
                break;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, n);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}