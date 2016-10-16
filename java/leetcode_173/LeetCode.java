package leetcode_173;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by pyan on 10/15/2016.
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

    public class BSTIterator {

        List<Integer> arr;
        int index;

        public BSTIterator(TreeNode root) {
            arr = new ArrayList<>();
            Stack<TreeNode> s = new Stack<>();
            while (!s.isEmpty() || root != null) {
                while (root != null) {
                    s.push(root);
                    root = root.left;
                }
                TreeNode pop = s.pop();
                arr.add(pop.val);
                root = pop.right;
            }
            this.index = 0;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return this.index < this.arr.size();
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            return this.arr.get(index++);
        }
    }
}
