package leetcode_283;

/**
 * Created by pyan on 9/16/2016.
 */
class LeetCode {
    public class Solution {
        public void moveZeroes(int[] nums) {
            if (nums == null || nums.length < 2) {
                return;
            }
            int zeroStoper = 0;
            int nonZeroChecker = 1;
            while (nonZeroChecker < nums.length) {
                if (nums[zeroStoper] != 0) {
                    // to find 0 and will stop
                    zeroStoper++;
                    nonZeroChecker++;
                } else {
                    // find 0
                    if (nums[nonZeroChecker] == 0) {
                        nonZeroChecker++;
                    } else {
                        //swap
                        int temp = nums[nonZeroChecker];
                        nums[nonZeroChecker] = nums[zeroStoper];
                        nums[zeroStoper] = temp;
                    }
                }
            }
        }
    }
}
