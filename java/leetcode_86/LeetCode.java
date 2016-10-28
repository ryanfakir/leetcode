package leetcode_86;

/**
 * Created by pyan on 10/27/2016.
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
        public ListNode partition(ListNode head, int x) {
            if (head == null) {
                return null;
            }
            ListNode smallHead = new ListNode(0);
            ListNode bigHead = new ListNode(0);
            ListNode small = smallHead;
            ListNode big = bigHead;
            while (head != null) {
                if (head.val < x) {
                    small.next = head;
                    small = small.next;
                } else {
                    big.next = head;
                    big = big.next;
                }
                head = head.next;
            }
            big.next = null;
            small.next = bigHead.next;
            return smallHead.next;
        }
    }
}
