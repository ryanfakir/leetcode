package leetcode_225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by pyan on 10/1/2016.
 */
public class LeetCode {
    class MyStack {
        // Push element x onto stack.
        Queue<Integer> value = new LinkedList<>();
        Queue<Integer> temp = new LinkedList<>();
        public void push(int x) {
            if (value.isEmpty()) {
                value.offer(x);
            } else {
                temp.offer(x);
                while (!value.isEmpty()) {
                    temp.offer(value.poll());
                }
                Queue<Integer> q = temp;
                temp = value;
                value = q;
            }
        }

        // Removes the element on top of the stack.
        public void pop() {
            value.poll();
        }

        // Get the top element.
        public int top() {
            return value.peek();
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return value.isEmpty();
        }
    }
}
