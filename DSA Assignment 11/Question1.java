package in.ineuron.main;

public class Question1{
    public static void main(String[] args) {
        int x = 4;
        int sqrt = mySqrt(x);
        System.out.println("Square root of " + x + ": " + sqrt);
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) right;
    }
}