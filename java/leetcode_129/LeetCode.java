package leetcode_129;

import java.util.Stack;

/**
 * Created by pyan on 10/21/2016.
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

    public class Solution_iterative {
        public int sumNumbers(TreeNode root) {
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode temp = root;
            int res = 0;
            int single = 0;
            while (!s.isEmpty() || temp != null) {
                while (temp != null) {
                    s.push(temp);
                    temp.val = single * 10 + temp.val;
                    single = temp.val;
                    temp = temp.left;
                }
                temp = s.pop();
                single = temp.val;
                if (temp.left == null && temp.right == null) {
                    res += single;
                }
                temp = temp.right;
            }
            return res;
        }
    }
}
