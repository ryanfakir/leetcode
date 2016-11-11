package leetcode_61;

/**
 * Created by pyan on 11/10/2016.
 */
public class LeetCode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public class Solution {
        public class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }

        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || k == 0) {
                return head;
            }
            ListNode tempHead = head;
            int cnt = 0;
            ListNode preRight = new ListNode(0);
            ListNode left = head, right = head;
            int length = 0;
            while (tempHead != null) {
                tempHead = tempHead.next;
                length++;
            }
            k = k % length;
            if (k == 0) {
                return head;
            }
            while (right != null) {
                while (cnt <= k && right != null) {
                    preRight = right;
                    right = right.next;
                    cnt++;
                }
                if (right == null) {
                    break;
                }
                preRight = right;
                right = right.next;
                left = left.next;
            }
            ListNode res = left.next;
            left.next = null;
            preRight.next = head;
            return res;
        }
    }
}
