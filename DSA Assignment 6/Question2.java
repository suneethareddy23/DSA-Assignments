package in.ineuron.main;


public class Question2 {
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
	            return false;
	        }
	        
	        int m = matrix.length;
	        int n = matrix[0].length;
	        int start = 0;
	        int end = (m * n) - 1;
	        
	        while (start <= end) {
	            int mid = start + (end - start) / 2;
	            int row = mid / n;
	            int col = mid % n;
	            
	            if (matrix[row][col] == target) {
	                return true;
	            } else if (matrix[row][col] < target) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        
	        return false;
	    }
	 
	 public static void main(String[] args) {
		 int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		 int target = 3;
		 System.out.println(searchMatrix(matrix,target));
	}
}

