package leetcode_94;

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
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            helper(root, res);
            return res;
        }

        private void helper(TreeNode root, List<Integer> arr) {
            if (root == null) {
                return;
            }
            helper(root.left, arr);
            arr.add(root.val);
            helper(root.right, arr);
            return;
        }
    }
}
