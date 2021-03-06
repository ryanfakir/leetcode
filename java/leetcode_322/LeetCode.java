package leetcode_322;

/**
 * Created by pyan on 11/6/2016.
 */
public class LeetCode {
    public class Solution {
        public int coinChange(int[] coins, int amount) {
            int[] dp = new int[amount+1];
            dp[0] = 0;
            for (int i=1; i<=amount; i++) {
                dp[i] = Integer.MAX_VALUE;
                for (int j=0; j<coins.length;j++) {
                    if (i-coins[j] >= 0 && dp[i-coins[j]] != Integer.MAX_VALUE) {
                        dp[i] = Math.min(dp[i], dp[i-coins[j]] + 1);
                    }
                }
            }
            return dp[amount] == Integer.MAX_VALUE? -1: dp[amount];
        }
    }
}
