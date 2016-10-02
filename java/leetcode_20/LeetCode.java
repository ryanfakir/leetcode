package leetcode_20;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by pyan on 10/1/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean isValid(String s) {
            Stack<Character> dict = new Stack<Character>();
            HashMap<Character, Character> hm = new HashMap<Character, Character>();
            hm.put(')', '(');
            hm.put(']', '[');
            hm.put('}', '{');
            for (int i= 0; i<s.length(); i++) {
                if (dict.isEmpty()) {
                    dict.push(s.charAt(i));
                } else if (dict.peek() == hm.get(s.charAt(i))) {
                    dict.pop();
                } else {
                    dict.push(s.charAt(i));
                }
            }
            return dict.isEmpty();
        }
    }
}
