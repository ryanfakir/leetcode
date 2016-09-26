package leetcode_101;

/**
 * Created by pyan on 9/25/2016.
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
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return helper(root.left, root.right);
        }

        private boolean helper(TreeNode left, TreeNode right) {
            if (left == null && right == null) {
                return true;
            } else if (left != null && right != null) {
                return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
            } else {
                return false;
            }
        }
    }
}
