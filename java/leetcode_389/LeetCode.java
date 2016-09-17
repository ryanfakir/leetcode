package leetcode_389;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pyan on 9/15/2016.
 */
class LeetCode {
    public class Solution {
        public char findTheDifference(String s, String t) {
            if (t == null || s == null || t.length() == 0) {
                return 0;
            }
            if (s.length() == 0) {
                return t.charAt(0);
            }
            char[] s_arr = s.toCharArray();
            char[] t_arr = t.toCharArray();
            Map<Character, Integer> store = new HashMap<>();
            for (int i = 0; i < t_arr.length; i++) {
                if (store.containsKey(t_arr[i])) {
                    store.put(t_arr[i], store.get(t_arr[i]) + 1);
                } else {
                    store.put(t_arr[i], 1);
                }
            }
            for (int i = 0; i < s_arr.length; i++) {
                store.put(s_arr[i], store.get(s_arr[i]) - 1);
                if (store.get(s_arr[i]) == 0) {
                    // delete entry
                    store.remove(s_arr[i]);
                }
            }
            // final print
            char res = '\0';
            for (char c : store.keySet()) {
                res = c;
            }
            return res;
        }
    }
}
