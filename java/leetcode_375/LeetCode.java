package leetcode_375;

/**
 * Created by pyan on 10/23/2016.
 */
class LeetCode {
    public class Solution {
        public int getMoneyAmount(int n) {
            int[][] dp = new int[n+1][n+1];
            return dp(dp, 1, n);
        }

        private int dp(int[][] arr, int left, int right) {
            if (left >= right) {
                return 0;
            }
            if (arr[left][right] != 0) {
                return arr[left][right];
            }
            int res = Integer.MAX_VALUE;
            for (int i = left; i<=right; i++) {
                int temp = i + Math.max(dp(arr, left, i-1), dp(arr, i+1, right));
                res = Math.min(res, temp);
            }
            arr[left][right] = res;
            return res;
        }
    }
}
