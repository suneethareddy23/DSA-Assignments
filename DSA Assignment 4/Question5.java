package in.ineuron.main;

public class Question5
{
    public static int arrangeCoins(int n) {
        int row = 0;
        int coins = n;

        while (coins >= row + 1) {
            row++;
            coins -= row;
        }

        return row;
    }

    public static void main(String[] args) {
        int n = 5;
        int completeRows = arrangeCoins(n);
        System.out.println(completeRows);  // Output: 2
    }
}