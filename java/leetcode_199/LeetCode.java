package leetcode_199;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by pyan on 10/14/2016.
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
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = q.poll();
                    if (pop.left != null) {
                        q.offer(pop.left);
                    }
                    if (pop.right != null) {
                        q.offer(pop.right);
                    }
                    if (i == size - 1) {
                        res.add(pop.val);
                    }
                }
            }
            return res;
        }
    }
}
