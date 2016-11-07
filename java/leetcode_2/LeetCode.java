package leetcode_2;

/**
 * Created by pyan on 11/7/2016.
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
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode result = new ListNode(0);
            ListNode res = result;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int v1 = l1 == null ? 0 : l1.val;
                int v2 = l2 == null ? 0 : l2.val;
                int temp = v1 + v2;
                if (carry == 1) {
                    temp += 1;
                }
                carry = temp / 10;
                result.next = new ListNode(temp % 10);
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
                result = result.next;
            }
            if (carry == 1) {
                result.next = new ListNode(1);
            }
            return res.next;
        }
    }
}
