package leetcode_112;

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

    public class Solution_dfs {
        public boolean hasPathSum(TreeNode root, int sum) {
            return dfs(root, 0, sum);
        }

        private boolean dfs(TreeNode root, int sum, int goal) {
            if (root == null) {
                return false;
            }
            sum += root.val;
            if (root.left == null && root.right == null) {
                if (sum == goal) {
                    return true;
                }
            }
            if (dfs(root.left, sum, goal) || dfs(root.right, sum, goal)) {
                return true;
            }
            return false;
        }
    }

    public class Solution_recursive {
        public boolean hasPathSum(TreeNode root, int sum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null && root.val == sum) {
                return true;
            }
            return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
        }
    }
}
