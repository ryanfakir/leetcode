package leetcode_108;

/**
 * Created by pyan on 10/12/2016.
 */
class LeetCode {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return helper(nums, 0, nums.length - 1);
        }

        private TreeNode helper(int[] nums, int start, int end) {
            int mid = (end - start) / 2 + start;
            TreeNode root = new TreeNode(nums[mid]);
            if (start <= mid - 1) {
                root.left = helper(nums, start, mid - 1);
            }
            if (mid + 1 <= end) {
                root.right = helper(nums, mid + 1, end);
            }
            return root;
        }
    }
}
