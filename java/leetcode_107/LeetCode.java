package leetcode_107;

import java.util.*;

/**
 * Created by pyan on 9/25/2016.
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
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) return res;
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                List<Integer> level = new ArrayList<Integer>();
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = q.poll();
                    level.add(temp.val);
                    if (temp.left != null) {
                        q.offer(temp.left);
                    }
                    if (temp.right != null) {
                        q.offer(temp.right);
                    }
                }
                res.add(level);
            }
            Collections.reverse(res);
            return res;
        }
    }
}
