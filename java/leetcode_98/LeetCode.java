package leetcode_98;

/**
 * Created by pyan on 11/11/2016.
 */
public class LeetCode {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isValidBST(TreeNode root) {
            if (root == null) {
                return true;
            }
            return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean valid(TreeNode root, long left, long right) {
            if (root == null) {
                return true;
            }
            if (root.val <= left || root.val >= right) {
                return false;
            }
            return valid(root.left, left, root.val) && valid(root.right, root.val, right);
        }
    }
}
