package in.ineuron.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question8 {
	
	public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
        int m = mat1.length;
        int k = mat1[0].length;
        int n = mat2[0].length;

        // Create a map to store the result matrix
        Map<String, Integer> resultMap = new HashMap<>();

        // Perform matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (mat1[i][j] != 0) {
                    for (int l = 0; l < n; l++) {
                        if (mat2[j][l] != 0) {
                            String key = i + "," + l;
                            int value = mat1[i][j] * mat2[j][l];
                            resultMap.put(key, resultMap.getOrDefault(key, 0) + value);
                        }
                    }
                }
            }
        }

        // Convert the result into a matrix
        int[][] resultMatrix = new int[m][n];
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            String[] key = entry.getKey().split(",");
            int i = Integer.parseInt(key[0]);
            int j = Integer.parseInt(key[1]);
            int value = entry.getValue();
            resultMatrix[i][j] = value;
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int[][] mat1 = {{1,0,0},{-1,0,3}};
        int[][] mat2 = {{7,0,0},{0,0,0},{0,0,1}};

        int[][] result = multiplySparseMatrices(mat1, mat2);

        System.out.print("[");
		for(int[] element:result)
			System.out.print(Arrays.toString(element));
		System.out.print("]");
    }
}