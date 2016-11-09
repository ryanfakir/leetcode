package leetcode_324;

import java.util.Arrays;

/**
 * Created by pyan on 11/8/2016.
 */
public class LeetCode {
    public class Solution {
        public void wiggleSort(int[] nums) {
            Arrays.sort(nums);
            int[] temp = new int[nums.length];
            int s = (nums.length + 1) >> 1, t = nums.length;
            for (int i = 0; i < nums.length; i++) {
                temp[i] = (i & 1) == 0 ?  nums[--s] : nums[--t] ;
            }

            for (int i = 0; i < nums.length; i++)
                nums[i] = temp[i];
        }
    }
}
