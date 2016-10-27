package leetcode_109;

/**
 * Created by pyan on 10/26/2016.
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

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) {
                return null;
            }
            if (head.next == null) {
                return new TreeNode(head.val);
            }
            ListNode slow = head, fast = head;
            ListNode prev = new ListNode(0);
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            TreeNode res = new TreeNode(slow.val);
            res.right = sortedListToBST(slow.next);
            prev.next = null;
            res.left = sortedListToBST(head);
            return res;
        }
    }
}
