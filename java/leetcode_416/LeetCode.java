package leetcode_416;

/**
 * Created by pyan on 10/9/2016.
 */
class LeetCode {
    public class Solution {
        public boolean canPartition(int[] nums) {
            int sum = 0;
            int n = nums.length;
            for (int i= 0; i< n; i++) {
                sum += nums[i];
            }
            if (sum %2 != 0) {
                return false;
            }
            boolean[][] dp = new boolean[sum/2+1][n+1];
            for (int i= 0; i<=n; i++) {
                dp[0][i] = true;
            }
            for (int i=1;i<=sum/2;i++) {
                dp[i][0] = false;
            }
            for (int i =1; i <=sum/2; i++) {
                for (int j=1; j<=n; j++) {
                    if (i >= nums[j-1]) {
                        dp[i][j] = dp[i][j-1] || dp[i-nums[j-1]][j-1];
                    }
                }
            }
            return dp[sum/2][n];
        }
    }
}
