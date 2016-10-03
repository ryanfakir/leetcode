package leetcode_203;

/**
 * Created by pyan on 10/3/2016.
 */
class LeetCode {
    public class Solution {

        public class ListNode {
            int val;
            ListNode next;

            ListNode(int x) {
                val = x;
            }
        }

        public ListNode removeElements(ListNode head, int val) {
            ListNode temp = new ListNode(0);
            temp.next = head;
            ListNode res = temp;
            while (temp.next != null) {
                if (temp.next.val == val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            return res.next;
        }
    }
}
