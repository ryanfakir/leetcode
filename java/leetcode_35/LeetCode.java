package leetcode_35;

/**
 * Created by pyan on 10/13/2016.
 */
class LeetCode {
    public class Solution {
        public int searchInsert(int[] nums, int target) {
            int right = nums.length-1;
            int left = 0;
            while (left + 1 < right) {
                int mid = (right - left)/2 + left;
                if (nums[mid] < target) {
                    left = mid;
                } else if (nums[mid] > target) {
                    right = mid;
                } else {
                    return mid;
                }
            }
            if (nums[right] == target) {
                return right;
            }
            if (nums[right] < target) {
                return right +1;
            }
            if (nums[left] >= target) {
                return left;
            } else {
                return right;
            }
        }
    }
}
