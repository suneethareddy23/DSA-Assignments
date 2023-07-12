package in.ineuron.main;
public class Question3 {
    public static int factorial(int N) {
        int result = 1;
        for (int i = 1; i <= N; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
        System.out.println(factorial(4));  // Output: 24
    }
}