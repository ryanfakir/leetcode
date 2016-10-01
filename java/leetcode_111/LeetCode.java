package leetcode_111;

/**
 * Created by pyan on 9/30/2016.
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
        public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            if (left == 0 || right == 0) {
                return left >= right ? left + 1 : right + 1;
            }
            return left >= right ? right + 1 : left + 1;
        }
    }
}
