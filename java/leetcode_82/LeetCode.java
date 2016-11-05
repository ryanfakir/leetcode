package leetcode_82;

/**
 * Created by pyan on 11/4/2016.
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
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.next != null) {
                if (prev.next.val == prev.next.next.val) {
                    int value = prev.next.val;
                    while (prev.next != null && prev.next.val == value) {
                        prev.next = prev.next.next;
                    }
                } else {
                    prev = prev.next;
                }
            }
            return dummy.next;
        }
    }
}
