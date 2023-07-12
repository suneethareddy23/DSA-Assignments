package in.ineuron.main;

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + (int) s1.charAt(i - 1);
        }

        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + (int) s2.charAt(j - 1);
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j] + (int) s1.charAt(i - 1), dp[i][j - 1] + (int) s2.charAt(j - 1));
                }
            }
        }

        return dp[m][n];
    }

	public int compress(char[] chars) {
		// TODO
		return 0;
	}
}
public class Question1 {
    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";

        Solution solution = new Solution();
        int result = solution.minimumDeleteSum(s1, s2);
        System.out.println(result); 
    }
}