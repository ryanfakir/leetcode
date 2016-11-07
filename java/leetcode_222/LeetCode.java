package leetcode_222;

/**
 * Created by pyan on 11/6/2016.
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
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int left = getLeftHeight(root.left);
            int right = getRightHeight(root.right);
            if (left == right) {
                return (1 << right + 1) - 1;
            } else {
                return countNodes(root.left) + countNodes(root.right) + 1;
            }
        }

        private int getLeftHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return getLeftHeight(root.left) + 1;
        }

        private int getRightHeight(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return getRightHeight(root.right) + 1;
        }
    }
}
