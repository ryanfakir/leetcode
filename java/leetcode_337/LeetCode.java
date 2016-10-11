package leetcode_337;

import java.util.HashMap;

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
        HashMap<TreeNode, Integer> m = new HashMap<>();

        public int rob(TreeNode root) {
            return helper(root);
        }

        private int helper(TreeNode root) {
            int val = 0;
            if (root == null) {
                return 0;
            }
            if (m.containsKey(root)) {
                return m.get(root);
            }
            if (root.left != null) {
                val += helper(root.left.left) + helper(root.left.right);
            }
            if (root.right != null) {
                val += helper(root.right.left) + helper(root.right.right);
            }
            val = Math.max(val + root.val, helper(root.left) + helper(root.right));
            m.put(root, val);
            return val;
        }
    }
}
