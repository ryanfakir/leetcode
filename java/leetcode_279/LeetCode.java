package leetcode_279;

/**
 * Created by pyan on 10/22/2016.
 */
class LeetCode {
    public class Solution {
        public int numSquares(int n) {
            int[] dp = new int[n+1];
            dp[0] = 0;
            for (int i = 1; i<n+1; i++) {
                dp[i] = Integer.MAX_VALUE;
                for (int j = 0; j*j<=i; j++) {
                    dp[i] = Math.min(dp[i], dp[i-j*j]);
                }
                dp[i] += 1;
            }
            return dp[n];
        }
    }
}
