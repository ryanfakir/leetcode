package leetcode_268;

/**
 * Created by pyan on 10/9/2016.
 */
class LeetCode {
    public class Solution {
        public int missingNumber(int[] nums) {
            int len = nums.length;
            int total = 0;
            int nTotal = 0;
            for (int i = 0; i<len; i++) {
                total += i;
                nTotal += nums[i];
            }
            return total- nTotal + len;
        }
    }
}
