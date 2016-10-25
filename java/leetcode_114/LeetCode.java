package leetcode_114;

import java.util.Stack;

/**
 * Created by pyan on 10/23/2016.
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

    public class Solution_iterative {
        public void flatten(TreeNode root) {
            if (root == null) {
                return;
            }
            Stack<TreeNode> s = new Stack<TreeNode>();
            s.push(root);
            while (!s.isEmpty()) {
                TreeNode temp = s.pop();
                if (temp.right != null) {
                    s.push(temp.right);
                }
                if (temp.left != null) {
                    s.push(temp.left);
                }
                temp.left = null;
                if (!s.isEmpty()) {
                    temp.right = s.peek();
                }
            }
        }
    }

    public class Solution_recursive {
        public void flatten(TreeNode root) {
            helper(root);
        }

        private TreeNode helper(TreeNode root) {
            if (root == null) {
                return null;
            }
            if (root.left == null && root.right == null) {
                return root;
            }
            if (root.left == null) {
                return helper(root.right);
            }
            if (root.right == null) {
                root.right = root.left;
                root.left = null;
                return helper(root.right);
            }
            TreeNode lastLeft = helper(root.left);
            TreeNode lastRight = helper(root.right);

            lastLeft.right = root.right;
            root.right = root.left;
            root.left = null;
            return lastRight;
        }
    }
}
