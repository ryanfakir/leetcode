package leetcode_80;

/**
 * Created by pyan on 10/22/2016.
 */
class LeetCode {
    public class Solution {
        public int removeDuplicates(int[] nums) {
            int left = 0, right = 1;
            int cnt = 0;
            while (right < nums.length) {
                if (nums[left] == nums[right]) {
                    if (cnt < 1) {
                        nums[left+1] = nums[right];
                        left++;
                        cnt++;
                    }
                } else {
                    nums[left+1] = nums[right];
                    cnt =0;
                    left++;
                }
                right++;
            }
            return left+1;
        }
    }
}
