package leetcode_388;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by pyan on 10/25/2016.
 */
class LeetCode {
    public class Solution_hashmap {
        public int lengthLongestPath(String input) {
            HashMap<Integer, Integer> m = new HashMap<>();
            int res = 0;
            for (String el : input.split("\n")) {
                int level = el.lastIndexOf("\t") +1;
                int len = el.substring(el.lastIndexOf("\t")+1).length();
                if (el.contains(".")) {
                    res = Math.max(res, m.getOrDefault(level-1, 0)+ len);
                } else {
                    m.put(level, m.getOrDefault(level-1, 0) + len+1);
                }
            }
            return res;
        }
    }

    public class Solution_stack {
        public int lengthLongestPath(String input) {
            Stack<Integer> s = new Stack<>();
            int res = 0;
            for (String el : input.split("\n")) {
                int level = el.lastIndexOf("\t")+2;
                while (level <= s.size()) {
                    s.pop();
                }
                if (s.size() == 0) {
                    s.push(el.substring(level-1).length() +1);
                } else {
                    s.push(s.peek() + el.substring(level-1).length() +1);
                }
                if (el.contains(".")) {
                    res = Math.max(res, s.peek()-1);
                }
            }
            return res;
        }
    }
}
