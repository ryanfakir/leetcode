package leetcode_144;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/9/2016.
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            helper(root, res);
            return res;
        }

        private void helper(TreeNode root, List<Integer> arr) {
            if (root == null) {
                return;
            }
            arr.add(root.val);
            helper(root.left, arr);
            helper(root.right, arr);
            return;
        }
    }
}
