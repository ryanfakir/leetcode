package leetcode_169;

import java.util.Arrays;

/**
 * Created by pyan on 9/20/2016.
 */
class LeetCode {
    public class Solution {
        public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            int len = nums.length;
            return nums[(len-1)/2];
        }
    }
}
