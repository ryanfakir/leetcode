package leetcode_92;

/**
 * Created by pyan on 11/1/2016.
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
        public ListNode reverseBetween(ListNode head, int m, int n) {
            if (m >= n || head == null) {
                return head;
            }
            ListNode prev = new ListNode(0);
            ListNode res = head;
            prev.next = head;
            int cnt = 1;
            while (head != null && cnt < m) {
                prev = head;
                head = head.next;
                cnt++;
            }

            ListNode fHead = prev;
            ListNode tHead = head;
            while (head != null && cnt <= n) {
                ListNode temp = head.next;
                head.next = prev;
                prev = head;
                head = temp;
                cnt++;
            }
            fHead.next = prev;
            tHead.next = head;
            if (m == 1) {
                return fHead.next;
            }
            return res;
        }
    }
}
