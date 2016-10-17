package leetcode_116;

/**
 * Created by pyan on 10/16/2016.
 */
public class LeetCode {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left, right, next;

        TreeLinkNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public void connect(TreeLinkNode root) {
            if (root == null) {
                return;
            }
            TreeLinkNode rootHead = root;
            while (rootHead.left != null) {
                TreeLinkNode temp = rootHead;
                while (temp != null) {
                    temp.left.next = temp.right;
                    temp = temp.next;
                }
                temp = rootHead;
                while (temp.next != null) {
                    temp.right.next = temp.next.left;
                    temp = temp.next;
                }
                rootHead = rootHead.left;
            }
        }
    }
}
