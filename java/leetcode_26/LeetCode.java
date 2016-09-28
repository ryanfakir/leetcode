package leetcode_26;

/**
 * Created by pyan on 9/27/2016.
 */
public class LeetCode {
    public class Solution {
        public int removeDuplicates(int[] nums) {
            int stop = 0;
            for (int i = 0; i< nums.length; i++) {
                if (nums[stop] != nums[i]) {
                    nums[++stop] = nums[i];
                }
            }
            return stop+1;
        }
    }
}
