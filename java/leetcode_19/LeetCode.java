package leetcode_19;

/**
 * Created by pyan on 10/1/2016.
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
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode zero = new ListNode(0);
            zero.next = head;
            ListNode temp = zero;
            ListNode tail = temp;
            int count = 0;
            while (tail != null) {
                tail = tail.next;
                if (count > n) {
                    temp = temp.next;
                }
                count++;
            }
            temp.next = temp.next.next;
            return zero.next;
        }
    }
}
