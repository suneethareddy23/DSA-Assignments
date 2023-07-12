package in.ineuron.main;

public class Question3 {

	public static  boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        
        int i = 1;
        
        while (i < n && arr[i] > arr[i - 1]) {
            i++;
        }
        
        if (i == 1 || i == n) {
            return false;
        }
        
        while (i < n && arr[i] < arr[i - 1]) {
            i++;
        }
        
        return i == n;
    }
	
	public static void main(String[] args) {
		int matrix[]= {2,1};
		System.out.println(validMountainArray(matrix));
	}
}

