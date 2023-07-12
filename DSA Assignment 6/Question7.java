package in.ineuron.main;

import java.util.Arrays;

public class Question7 {
	public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0, rowEnd = n - 1;
        int colStart = 0, colEnd = n - 1;
        int num = 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse top row
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = num++;
            }
            rowStart++;

            // Traverse rightmost column
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = num++;
            }
            colEnd--;

            if (rowStart <= rowEnd && colStart <= colEnd) {
                // Traverse bottom row
                for (int col = colEnd; col >= colStart; col--) {
                    matrix[rowEnd][col] = num++;
                }
                rowEnd--;

                // Traverse leftmost column
                for (int row = rowEnd; row >= rowStart; row--) {
                    matrix[row][colStart] = num++;
                }
                colStart++;
            }
        }

        return matrix;
    }
	
	public static void main(String[] args) {
		int n=3;
		int[][] result = generateMatrix(n);
		System.out.print("[");
		for(int[] element:result)
			System.out.print(Arrays.toString(element));
		System.out.print("]");
	}

}