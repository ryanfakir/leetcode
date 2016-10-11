package leetcode_230;

/**
 * Created by pyan on 10/10/2016.
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
        int count = 0;
        int number = 0;

        public int kthSmallest(TreeNode root, int k) {
            count = k;
            helper(root);
            return number;
        }

        private void helper(TreeNode root) {
            if (root == null) {
                return;
            }
            helper(root.left);
            count--;
            if (count == 0) {
                number = root.val;
                return;
            }
            helper(root.right);
            return;
        }
    }
}
