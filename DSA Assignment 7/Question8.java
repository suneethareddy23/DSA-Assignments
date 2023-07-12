package in.ineuron.main;


public class Question8 {
	
	public static boolean checkStraightLine(int[][] coordinates) {
        int[] point1 = coordinates[0];
        int[] point2 = coordinates[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] currPoint = coordinates[i];
            if ((currPoint[1] - point1[1]) * (point2[0] - point1[0]) != (point2[1] - point1[1]) * (currPoint[0] - point1[0])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        System.out.println(checkStraightLine(coordinates));
    }
}