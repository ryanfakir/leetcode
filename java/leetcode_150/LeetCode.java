package leetcode_150;

import java.util.Stack;

/**
 * Created by pyan on 11/7/2016.
 */
public class LeetCode {
    public class Solution {
        public int evalRPN(String[] tokens) {
            if (tokens == null || tokens.length ==0) {
                return 0;
            }
            Stack<Integer> s = new Stack<>();
            for (String el : tokens) {
                int sec = 0, first = 0;
                if (el.equals("+")) {
                    sec = s.pop();
                    first = s.pop();
                    s.push(first + sec);
                } else if (el.equals("-")) {
                    sec = s.pop();
                    first = s.pop();
                    s.push(first - sec);
                } else if (el.equals("*")) {
                    sec = s.pop();
                    first = s.pop();
                    s.push(first * sec);
                } else if (el.equals("/")) {
                    sec = s.pop();
                    first = s.pop();
                    s.push(first/sec);
                } else {
                    s.push(Integer.parseInt(el));
                }
            }
            return s.pop();
        }
    }
}
