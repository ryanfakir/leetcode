package leetcode_141;

/**
 * Created by pyan on 9/25/2016.
 */
public class LeetCode {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode walker = head;
            ListNode runner = head;
            boolean res = false;
            while (walker != null && runner != null && runner.next != null) {
                walker = walker.next;
                runner = runner.next.next;
                if (walker == null || runner == null) {
                    res = false;
                    break;
                }
                if (walker.val == runner.val) {
                    res = true;
                    break;
                }
            }
            return res;
        }
    }
}
