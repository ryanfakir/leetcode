package leetcode_395;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pyan on 10/23/2016.
 */
public class LeetCode {
    public class Solution {
        public int longestSubstring(String s, int k) {
            if (s.length() < k ) {
                return 0;
            }
            HashMap<Character, Integer> dict = new HashMap<>();
            for (int i = 0; i<s.length(); i++) {
                dict.put(s.charAt(i), dict.getOrDefault(s.charAt(i), 0) +1);
            }
            for (Map.Entry<Character, Integer> el : dict.entrySet()) {
                if (el.getValue() < k) {
                    int res = 0;
                    for (String sub : s.split(String.valueOf(el.getKey()))) {
                        res = Math.max(res, longestSubstring(sub, k));
                    }
                    return res;
                }
            }
            return s.length();
        }
    }
}
