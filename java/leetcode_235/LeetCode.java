package leetcode_235;

/**
 * Created by pyan on 9/24/2016.
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

    public class SolutionIterative {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            TreeNode temp = root;
            TreeNode res = root;
            while (temp != null) {
                if (Math.max(p.val, q.val) >= temp.val && Math.min(p.val, q.val) <= temp.val) {
                    res = temp;
                    break;
                } else if (Math.max(p.val, q.val) < temp.val) {
                    temp = temp.left;
                } else if (Math.min(p.val, q.val) > temp.val) {
                    temp = temp.right;
                }
            }
            return res;
        }
    }

    public class SolutionRecursive {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root.val == q.val || root.val == p.val) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            return left == null ? right : left;
        }
    }
}
