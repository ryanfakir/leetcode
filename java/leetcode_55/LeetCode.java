package leetcode_55;

/**
 * Created by pyan on 11/3/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean canJump(int[] nums) {
            if (nums == null && nums.length == 0) {
                return false;
            }
            int len = nums[0];
            for (int i=1; i<nums.length; i++) {
                if (i <= len && nums[i] + i > len) {
                    len = nums[i] + i;
                }
            }
            return len >= nums.length-1;
        }
    }
}
