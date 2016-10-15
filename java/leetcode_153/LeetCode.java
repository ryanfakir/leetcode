package leetcode_153;

/**
 * Created by pyan on 10/14/2016.
 */
class LeetCode {
    public class Solution {
        public int findMin(int[] nums) {
            int left = 0;
            int right = nums.length-1;
            if (nums[left] <= nums[right]) {
                return nums[left];
            }
            while (left + 1 < right) {
                int mid = (right-left)/2 + left;
                if (nums[mid] > nums[left]) {
                    left = mid;
                } else if (nums[mid] < nums[right]) {
                    right = mid;
                }
            }
            if (nums[0] < nums[right]) {
                return nums[right +1];
            } else if (nums[left]<nums[0]) {
                return nums[left];
            } else {
                return nums[right];
            }
        }
    }
}
