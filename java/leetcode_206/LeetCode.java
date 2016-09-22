package leetcode_206;

/**
 * Created by pyan on 9/21/2016.
 */
class LeetCode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            while (head != null) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
            }
            return prev;
        }
    }
}
