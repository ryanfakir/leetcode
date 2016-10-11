package leetcode_328;

/**
 * Created by pyan on 10/10/2016.
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
        public ListNode oddEvenList(ListNode head) {
            if (head == null) {
                return null;
            }
            ListNode temp = head;
            ListNode evenHead = head.next;
            ListNode prev = new ListNode(0);
            prev.next = temp;
            int flag = 1;
            while (temp.next != null) {
                ListNode x = temp.next;
                temp.next = x.next;
                prev = temp;
                temp = x;
                flag++;
            }
            if (flag % 2 == 0) {
                prev.next = evenHead;
            } else {
                temp.next = evenHead;
            }
            return head;
        }
    }
}
