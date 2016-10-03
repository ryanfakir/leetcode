package leetcode_160;

/**
 * Created by pyan on 10/2/2016.
 */
public class LeetCode {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution_one {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if (headA == null || headB == null) {
                return null;
            }
            int lenA = 0;
            int lenB = 0;
            ListNode tempA = headA;
            ListNode tempB = headB;
            while (tempA != null) {
                tempA = tempA.next;
                lenA++;
            }
            while (tempB != null) {
                tempB = tempB.next;
                lenB++;
            }
            tempA = headA;
            tempB = headB;
            if (lenA > lenB) {
                while (lenA != lenB) {
                    tempA = tempA.next;
                    lenA--;
                }
            } else {
                while (lenA != lenB) {
                    tempB = tempB.next;
                    lenB--;
                }
            }
            while (tempA != null && tempB != null) {
                if (tempA.val == tempB.val) {
                    return tempA;
                }
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return null;
        }
    }

    public class Solution_two {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode tempA = headA;
            ListNode tempB = headB;
            while (tempA != tempB) {
                tempA = tempA == null ? headB : tempA.next;
                tempB = tempB == null ? headA : tempB.next;
            }
            return tempA;
        }
    }
}
