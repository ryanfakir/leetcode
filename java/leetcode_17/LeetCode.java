package leetcode_17;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/27/2016.
 */
public class LeetCode {
    public class Solution {
        public List<String> letterCombinations(String digits) {
            if (digits.length() ==0) {
                return new ArrayList<>();
            }
            String[] phone = new String[] {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            List<String> res = new ArrayList<>();
            dfs(res, "", 0, phone, digits);
            return res;
        }

        private void dfs(List<String> res, String cur, int level, String[] phone, String digits) {
            if (level == digits.length()) {
                res.add(cur);
                return;
            }
            String dict = phone[digits.charAt(level) - '2'];
            for (int i = 0; i<dict.length(); i++) {
                cur += dict.charAt(i);
                dfs(res, cur, level+1, phone, digits);
                cur = cur.substring(0, cur.length()-1);
            }
        }
    }
}
