package in.ineuron.main;

import java.util.Arrays;

public class Question8 {
    public static boolean canAttendMeetings(int[][] intervals) {
        // Sort the intervals array based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Check for overlaps
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = canAttendMeetings(intervals);
        System.out.println(result);
    }
}