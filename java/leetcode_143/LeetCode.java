package leetcode_143;

/**
 * Created by pyan on 11/9/2016.
 */
public class LeetCode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public void reorderList(ListNode head) {
            ListNode left = head, right = head;
            if (right == null) return;
            while (right.next != null && right.next.next != null) {
                left = left.next;
                right = right.next.next;
            }
            ListNode temp = left.next;
            left.next = null;
            left = temp;
            ListNode prev = null;
            while (left != null) {
                temp = left.next;
                left.next = prev;
                prev = left;
                left = temp;
            }
            ListNode first = head, sec = prev;
            while (sec != null && first != null) {
                temp = first.next;
                ListNode tempSec = sec.next;
                sec.next = temp;
                first.next = sec;
                sec = tempSec;
                first = temp;
            }
        }
    }
}
