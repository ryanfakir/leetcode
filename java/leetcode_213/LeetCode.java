package leetcode_213;

/**
 * Created by pyan on 10/25/2016.
 */
class LeetCode {
    public class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2){
                return Math.max(nums[0], nums[1]);
            }
            return Math.max(helper(nums, 0), helper(nums, 1));
        }

        private int helper(int[] nums, int start) {
            int[] dp = new int[nums.length];
            dp[0] = nums[start];
            dp[1] = Math.max(nums[start],nums[start+1]);
            for (int i = 2; i<nums.length-1; i++) {
                dp[i] = Math.max(nums[start+2]+dp[i-2], dp[i-1]);
                start++;
            }
            return dp[nums.length-2];
        }
    }
}
