package leetcode_21;

/**
 * Created by pyan on 9/24/2016.
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
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode placeHolder = new ListNode(0);
            ListNode temp = placeHolder;
            while (l1 != null && l2 != null) {
                if (l1.val >= l2.val) {
                    temp.next = new ListNode(l2.val);
                    l2 = l2.next;
                } else {
                    temp.next = new ListNode(l1.val);
                    l1 = l1.next;
                }
                temp = temp.next;
            }
            while (l1 != null) {
                temp.next = new ListNode(l1.val);
                l1 = l1.next;
                temp = temp.next;
            }
            while (l2 != null) {
                temp.next = new ListNode(l2.val);
                l2 = l2.next;
                temp = temp.next;
            }
            return placeHolder.next;
        }
    }
}
