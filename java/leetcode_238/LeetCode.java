package leetcode_238;

/**
 * Created by pyan on 10/8/2016.
 */
class LeetCode {
    public class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] res = new int[nums.length];
            res[0] = 1;
            for (int i = 1; i<nums.length; i++) {
                res[i] = res[i-1] * nums[i-1];
            }
            int right = 1;
            for (int i = nums.length-1; i>=0; i--) {
                res[i] *= right;
                right *= nums[i];
            }
            return res;
        }
    }
}
