package leetcode_334;

/**
 * Created by pyan on 10/16/2016.
 */
class LeetCode {
    public class Solution_DP {
        public boolean increasingTriplet(int[] nums) {
            if (nums == null || nums.length < 3) {
                return false;
            }
            int[] dp = new int[nums.length];
            dp[0] = 0;
            for (int i = 1; i < nums.length; i++) {
                int start = 0;
                while (start < i) {
                    if (nums[start] < nums[i]) {
                        dp[i] = Math.max(dp[i], dp[start] + 1);
                    }
                    if (dp[i] == 2) {
                        return true;
                    }
                    start++;
                }
            }
            return false;
        }
    }

    public class Solution_window {
        public boolean increasingTriplet(int[] nums) {
            int m1 = Integer.MAX_VALUE;
            int m2 = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= m1) {
                    m1 = nums[i];
                } else if (nums[i] <= m2) {
                    m2 = nums[i];
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
