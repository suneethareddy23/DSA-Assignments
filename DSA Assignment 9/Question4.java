package in.ineuron.main;
public class Question4 {
    public static int calculateExponent(int N, int P) {
        int result = 1;
        for (int i = 1; i <= P; i++) {
            result *= N;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateExponent(5, 2));  // Output: 25
        System.out.println(calculateExponent(2, 5));  // Output: 32
    }
}



