package leetcode_27;

/**
 * Created by pyan on 9/25/2016.
 */
class LeetCode {
    public class Solution {
        public int removeElement(int[] nums, int val) {
            int length = nums.length;
            int mark = 0;
            for (int i = 0; i< length; i++) {
                if (nums[i] != val) {
                    nums[mark++] = nums[i];
                }

            }
            return mark;
        }
    }
}
