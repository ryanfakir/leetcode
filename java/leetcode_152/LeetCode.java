package leetcode_152;

/**
 * Created by pyan on 11/10/2016.
 */
public class LeetCode {
    public class Solution {
        public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int res = nums[0];
            int max = nums[0];
            int min = nums[0];
            for (int i =1; i<nums.length;i++) {
                int tempMax = max;
                int tempMin = min;
                max = Math.max(Math.max(tempMax*nums[i], nums[i]), tempMin*nums[i]);
                min = Math.min(Math.min(tempMin*nums[i], nums[i]), tempMax*nums[i]);
                res = Math.max(res, max);
            }
            return res;
        }
    }
}
