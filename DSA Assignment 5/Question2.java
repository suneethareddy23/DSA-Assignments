package in.ineuron.main;

public class Question2 {

	public static int numberOfCompleteRows(int n) {
        int k = 0;
        int sum = 0;

        while (sum <= n) {
            k++;
            sum += k;
        }

        return k - 1;
    }

    public static void main(String[] args) {
        
        int n = 5;
        int completeRows =numberOfCompleteRows(n);
        System.out.println("Number of complete rows: " + completeRows);
    }
}
