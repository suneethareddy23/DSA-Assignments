package in.ineuron.main;
 class Solution181 extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Solution181 solution = new Solution181();

        int n1 = 5;
        int bad1 = 4;
        int firstBadVersion1 = solution.firstBadVersion(n1);
        System.out.println(firstBadVersion1);
        // Output: 4

        int n2 = 1;
        int bad2 = 1;
        int firstBadVersion2 = solution.firstBadVersion(n2);
        System.out.println(firstBadVersion2);
        // Output: 1
    }
}