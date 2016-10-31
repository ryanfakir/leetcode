package leetcode_34;

/**
 * Created by pyan on 10/30/2016.
 */
public class LeetCode {
    public class Solution {
        public int[] searchRange(int[] nums, int target) {
            if (nums.length == 0) {
                return new int[]{-1,-1};
            }
            int left = 0, right = nums.length-1;
            int[] res = new int[2];
            while (left +1 < right) {
                int mid = (right-left)/2 + left;
                if (nums[mid] >= target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid;
                }
            }
            if (nums[left] == target){
                res[0] = left;
            } else if (nums[right] == target) {
                res[0] = right;
            } else {
                res[0] = -1;
                res[1] = -1;
                return res;
            }
            left = 0;
            right = nums.length-1;
            while (left +1 < right) {
                int mid = (right-left)/2 + left;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] <= target) {
                    left = mid;
                }
            }
            if (nums[right] == target){
                res[1] = right;
            } else if (nums[left] == target) {
                res[1] = left;
            } else {
                res[0] = -1;
                res[1] = -1;
                return res;
            }
            return res;
        }
    }
}
