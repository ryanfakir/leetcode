package leetcode_377;

/**
 * Created by pyan on 10/10/2016.
 */
class LeetCode {
    public class Solution {
        public int combinationSum4(int[] nums, int target) {
            if (nums.length == 0) {
                return 0;
            }
            int[] dp = new int[target+1];
            dp[0] = 1;
            for (int i =1; i<dp.length; i++) {
                for (int el : nums) {
                    if (i >= el) {
                        dp[i] += dp[i-el];
                    }
                }
            }
            return dp[target];
        }
    }
}
