package in.ineuron.main;

public class Question1{
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }

        int x = 1;
        while (x <= n) {
            if (x == n) {
                return true;
            }
            x *= 2;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));  
        System.out.println(isPowerOfTwo(16));  
        System.out.println(isPowerOfTwo(3));  
    }
}





