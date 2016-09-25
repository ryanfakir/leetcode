package leetcode_198;

/**
 * Created by pyan on 9/24/2016.
 */
class LeetCode {
    public class Solution {
        public int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int[] s = new int[nums.length +1];
            s[0] = 0;
            s[1] = nums[0];
            for (int i = 2; i< nums.length+1 ;i++) {
                s[i] = Math.max(s[i-1], s[i-2] + nums[i-1]);
            }
            return s[nums.length];
        }
    }
}
