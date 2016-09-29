package leetcode_232;

import java.util.Stack;

/**
 * Created by pyan on 9/28/2016.
 */
class LeetCode {
    class MyQueue {
        // Push element x to the back of queue.

        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> value = new Stack<Integer>();
        public void push(int x) {
            if (!value.isEmpty()) {
                while (!value.isEmpty()) {
                    int val = value.pop();
                    temp.push(val);
                }
                temp.push(x);
                while (!temp.isEmpty()) {
                    int val = temp.pop();
                    value.push(val);
                }
            } else {
                value.push(x);
            }
        }

        // Removes the element from in front of queue.
        public void pop() {
            value.pop();
        }

        // Get the front element.
        public int peek() {
            return value.peek();
        }

        // Return whether the queue is empty.
        public boolean empty() {
            return value.isEmpty();
        }
    }
}
