package leetcode_102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by pyan on 9/27/2016.
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            Queue<TreeNode> q = new LinkedList<>();
            if (root == null) {
                return res;
            }
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> level = new ArrayList<Integer>();
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
            return res;
        }
    }
}
