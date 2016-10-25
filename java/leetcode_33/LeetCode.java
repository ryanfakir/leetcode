package leetcode_33;

/**
 * Created by pyan on 10/24/2016.
 */
class LeetCode {
    public class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] < target) {
                    if (nums[left] > nums[mid] && target >= nums[left]) {
                        right = mid;
                    } else {
                        left = mid;
                    }
                } else if (nums[mid] > target) {
                    if (nums[left] > target && nums[mid] >= nums[left]) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                } else {
                    return mid;
                }
            }
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            return -1;
        }
    }
}
