package leetcode_31;

/**
 * Created by pyan on 11/5/2016.
 */
public class LeetCode {
    public class Solution {
        public void nextPermutation(int[] nums) {
            if (nums == null || nums.length == 0) {
                return;
            }
            int left = nums.length-2, right = 0;
            while (left >= 0) {
                if (nums[left] < nums[left+1]) {
                    break;
                } else {
                    left--;
                }
            }
            if (left == -1) {
                reverse(nums, 0);
                return;
            }
            for (int i=nums.length-1; i>=0; i--) {
                if (nums[i] > nums[left]) {
                    right = i;
                    break;
                }
            }
            swap(nums, left, right);
            reverse(nums, left+1);
        }

        private void swap(int[] nums, int left, int right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }

        private void reverse(int[] nums, int left) {
            int right = nums.length-1;
            for (int i=left; i<right; i++, right--) {
                swap(nums, i, right);
            }
        }
    }
}
