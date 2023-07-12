package in.ineuron.main;

public class Question6{
    public static void towerOfHanoi(int N, char fromRod, char toRod, char auxRod) {
        if (N == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        towerOfHanoi(N - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + N + " from rod " + fromRod + " to rod " + toRod);
        towerOfHanoi(N - 1, auxRod, toRod, fromRod);
    }

    public static int countTowerOfHanoiSteps(int N) {
        return (int) Math.pow(2, N) - 1;
    }

    public static void main(String[] args) {
        int N = 3;
        towerOfHanoi(N, '1', '3', '2');
        int totalSteps = countTowerOfHanoiSteps(N);
        System.out.println("Total steps: " + totalSteps);
    }
}