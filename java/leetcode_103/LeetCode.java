package leetcode_103;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by pyan on 10/27/2016.
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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();
            if (root == null) {
                return res;
            }
            Stack<TreeNode> s = new Stack<>();
            s.push(root);
            int level = 0;
            while (!s.isEmpty()) {
                List<Integer> curLevel = new ArrayList<>();
                Stack<TreeNode> temp = new Stack<>();
                int size = s.size();
                for (int i = 0; i < size; i++) {
                    TreeNode pop = s.pop();
                    curLevel.add(pop.val);
                    if (level % 2 == 0) {
                        if (pop.left != null) {
                            temp.push(pop.left);
                        }
                        if (pop.right != null) {
                            temp.push(pop.right);
                        }
                    } else {
                        if (pop.right != null) {
                            temp.push(pop.right);
                        }
                        if (pop.left != null) {
                            temp.push(pop.left);
                        }
                    }
                }
                s = temp;
                res.add(curLevel);
                level++;
            }
            return res;
        }
    }
}
