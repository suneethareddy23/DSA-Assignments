package in.ineuron.main;

import java.util.Arrays;

public class Question6{
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] squares = new int[n];

        for (int i = 0; i < n; i++) {
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);

        return squares;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] sortedSquaresArray = sortedSquares(nums);
        System.out.println(Arrays.toString(sortedSquaresArray));  // Output: [0, 1, 9, 16, 100]
    }
}





