package leetcode_257;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by pyan on 9/29/2016.
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
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> res = new LinkedList<>();
            dfs(root, res, "");
            return res;
        }

        private void dfs(TreeNode node, List<String> dict, String segment) {
            if (node == null) {
                return;
            }
            if (segment == "") {
                segment += node.val;
            } else {
                segment += "->" + node.val;
            }
            dfs(node.left, dict, segment);
            dfs(node.right, dict, segment);
            if (node.left == null && node.right == null) {
                dict.add(segment);
            }
        }
    }
}
