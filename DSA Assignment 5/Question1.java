package in.ineuron.main;

public class Question1 {

	public static int[][] convert1DArrayTo2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];  
        }

        int[][] result = new int[m][n];  

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
    
        int[] original = {7,14,21,28,35,42};
        int m = 2;
        int n = 3;
        
        int[][] result = convert1DArrayTo2DArray(original, m, n);
        
        for (int element[]:result) {
            for (int elem:element) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}