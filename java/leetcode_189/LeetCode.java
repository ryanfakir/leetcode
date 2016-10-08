package leetcode_189;

/**
 * Created by pyan on 10/7/2016.
 */
class LeetCode {
    public class Solution {
        public void rotate(int[] nums, int k) {
            if (nums == null || nums.length == 0) {
                return;
            }
            if (k > nums.length) {
                k = k%(nums.length);
            }
            int length = nums.length;
            int[] res = new int[length];
            for (int i = 0; i< length; i++){
                if (i < k) {
                    res[i] = nums[length-k + i];
                } else {
                    res[i] = nums[i-k];
                }
            }
            for (int i = 0; i<length; i++) {
                nums[i] = res[i];
            }
            return;
        }
    }
}
