package in.ineuron.main;
import java.util.Arrays;

class Solution184 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }

        return arrows;
    }
}

public class Question6 {
    public static void main(String[] args) {
        Solution184 solution = new Solution184();

        int[][] points1 = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int minArrows1 = solution.findMinArrowShots(points1);
        System.out.println(minArrows1);
        // Output: 2

        int[][] points2 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int minArrows2 = solution.findMinArrowShots(points2);
        System.out.println(minArrows2);
        // Output: 4

        int[][] points3 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int minArrows3 = solution.findMinArrowShots(points3);
        System.out.println(minArrows3);
        // Output: 2
    }
}