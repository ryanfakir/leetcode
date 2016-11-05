package leetcode_209;

/**
 * Created by pyan on 11/4/2016.
 */
public class LeetCode {
    public class Solution {
        public int minSubArrayLen(int s, int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int left = 0, right = 0;
            int res = Integer.MAX_VALUE;
            int sum = 0;
            while (true) {
                while(sum < s && right < nums.length) {
                    sum += nums[right];
                    right++;
                }
                while(sum>=s && left < nums.length) {
                    sum -= nums[left];
                    left++;
                }
                res = Math.min(res, right-left+1);
                if (right == nums.length) {
                    break;
                }

            }
            if (left ==0) {
                return 0;
            }
            return res;
        }
    }
}
