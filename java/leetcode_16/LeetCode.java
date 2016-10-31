package leetcode_16;

import java.util.Arrays;

/**
 * Created by pyan on 10/30/2016.
 */
public class LeetCode {
    public class Solution {
        public int threeSumClosest(int[] nums, int target) {
            if (nums.length <3) {
                return 0;
            }
            Arrays.sort(nums);
            int res = 0;
            int diff = Integer.MAX_VALUE;
            for (int i=1; i<nums.length-1; i++) {
                int sum = 0;
                int left = 0, right = nums.length-1;
                while (left < i && i< right) {
                    sum = nums[i] + nums[left] + nums[right];
                    if (diff > Math.abs(sum-target)) {
                        diff = Math.abs(sum-target);
                        res = sum;
                    }
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        return target;
                    }
                }
            }
            return res;
        }
    }
}
