package leetcode_110;

/**
 * Created by pyan on 9/26/2016.
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
        public boolean isBalanced(TreeNode root) {
            return getHeight(root) != -1;
        }

        private int getHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            if (left == -1 || right == -1) {
                return -1;
            }
            if (Math.abs(left - right) > 1) {
                return -1;
            }
            return left > right ? left + 1 : right + 1;
        }
    }
}
