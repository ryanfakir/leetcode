package leetcode_113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by pyan on 10/29/2016.
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
        public List<List<Integer>> pathSum(TreeNode root, int sum) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> cur = new ArrayList<>();
            dfs(res, cur, root, sum);
            return res;
        }

        private void dfs(List<List<Integer>> res, List<Integer> cur, TreeNode root, int sum) {
            if (root == null) {
                return;
            }
            cur.add(root.val);
            if (root.left == null && root.right == null && sum == root.val) {
                res.add(new ArrayList<>(cur));
            }
            dfs(res, cur, root.left, sum - root.val);
            dfs(res, cur, root.right, sum - root.val);
            cur.remove(cur.size() - 1);
        }
    }

}
