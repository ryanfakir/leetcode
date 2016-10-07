package leetcode_155;

import java.util.Stack;

/**
 * Created by pyan on 10/6/2016.
 */
public class LeetCode {
    public class MinStack {

        /** initialize your data structure here. */
        Stack<Integer> minStack;
        Stack<Integer> s ;
        public MinStack() {
            minStack = new Stack<Integer>();
            s = new Stack<Integer>();
        }

        public void push(int x) {
            s.push(x);
            if (minStack.isEmpty()) {
                minStack.push(x);
            } else {
                minStack.push(Math.min(x, minStack.peek()));
            }
        }

        public void pop() {
            minStack.pop();
            s.pop();
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
}
