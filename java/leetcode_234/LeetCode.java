package leetcode_234;

import java.util.Stack;

/**
 * Created by pyan on 10/3/2016.
 */
public class LeetCode {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution_withStack {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            ListNode slow = head;
            ListNode fast = head;
            Stack<ListNode> s = new Stack<ListNode>();
            while (fast != null && fast.next != null) {
                s.push(slow);
                slow = slow.next;
                fast = fast.next.next;
            }
            if (fast != null) {
                slow = slow.next;
            }
            while (slow != null) {
                ListNode temp = s.pop();
                if (slow.val != temp.val) {
                    return false;
                }
                slow = slow.next;
            }
            return true;
        }
    }
}
