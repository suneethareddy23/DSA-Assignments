package in.ineuron.main;
class Solution2 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = i + j;
                } else if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[m][n];
    }
}
public class Question3 {
    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";

        Solution2 solution = new Solution2();
        int minSteps = solution.minDistance(word1, word2);
        System.out.println(minSteps);  // Output: 2
    }
}