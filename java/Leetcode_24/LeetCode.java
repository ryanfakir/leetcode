package Leetcode_24;

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
        public ListNode swapPairs(ListNode head) {
            ListNode placeHolder = new ListNode(0);
            placeHolder.next = head;
            ListNode temp = placeHolder;
            while (temp != null && temp.next != null && temp.next.next != null) {
                ListNode origin = temp.next;
                temp.next = temp.next.next;
                ListNode des = temp.next.next;
                temp.next.next = origin;
                temp = origin;
                temp.next = des;
            }
            return placeHolder.next;
        }
    }
}
