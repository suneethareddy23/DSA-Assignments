package in.ineuron.main;


public class Question2 {
    public static int sumOfFirstNNumbers(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfFirstNNumbers(3));  // Output: 6
        System.out.println(sumOfFirstNNumbers(5));  // Output: 15
    }
}