package in.ineuron.main;
public class Question2 {
    public static int lastRemaining(int n) {
        int start = 1;
        int end = n;
        int step = 1;
        boolean leftToRight = true;

        while (start < end) {
            if (leftToRight || (end - start) % (2 * step) == 0) {
                start += step;
            }
            end -= step;
            step *= 2;
            leftToRight = !leftToRight;
        }

        return start;
    }

    public static void main(String[] args) {
        System.out.println(lastRemaining(9));  
        System.out.println(lastRemaining(5));  
        System.out.println(lastRemaining(1));  
    }
}