package in.ineuron.main;

public class Question6 {
    public static int findNthTerm(int a, int d, int n) {
        return a + (n - 1) * d;
    }

    public static void main(String[] args) {
        int a1 = 2, d1 = 1, n1 = 5;
        System.out.println("Nth term: " + findNthTerm(a1, d1, n1));  // Output: 6

        int a2 = 5, d2 = 2, n2 = 10;
        System.out.println("Nth term: " + findNthTerm(a2, d2, n2));  // Output: 23
    }
}