package leetcode_83;

/**
 * Created by pyan on 9/23/2016.
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

            ListNode fir = head;
            while (fir != null) {
                ListNode sec = fir.next;
                while (sec != null) {
                    if (sec.val == fir.val) {
                        fir.next = sec.next;
                        sec = sec.next;
                    } else {
                        break;
                    }
                }
                fir = sec;
            }
            return head;
        }
    }
}
