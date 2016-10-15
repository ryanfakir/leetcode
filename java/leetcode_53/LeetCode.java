package leetcode_53;

/**
 * Created by pyan on 10/14/2016.
 */
class LeetCode {
    public class Solution {
        public int maxSubArray(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int sum = 0;
            int res = Integer.MIN_VALUE;
            for (int i=0; i<nums.length; i++) {
                sum += nums[i];
                res = Math.max(res, sum);
                sum = Math.max(sum, 0);
            }
            return res;
        }
    }
}
