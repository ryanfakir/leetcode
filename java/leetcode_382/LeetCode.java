package leetcode_382;

import java.util.Random;

/**
 * Created by pyan on 10/8/2016.
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

        /**
         * @param head The linked list's head.
         * Note that the head is guaranteed to be not null, so it contains at least one node.
         */
        int len;
        Random r;
        ListNode head;

        public Solution(ListNode head) {
            this.head = head;
            ListNode temp = head;
            r = new Random();
            len = 0;
            while (temp != null) {
                len++;
                temp = temp.next;
            }
        }

        /**
         * Returns a random node's value.
         */
        public int getRandom() {
            int index = r.nextInt(len);
            System.out.println(index);
            ListNode temp = head;
            while (index != 0) {
                temp = temp.next;
                index--;
            }
            return temp.val;
        }
    }
}
