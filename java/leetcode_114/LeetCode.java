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

    public class Solution {
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
}
