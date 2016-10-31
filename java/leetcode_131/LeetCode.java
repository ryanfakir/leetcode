package leetcode_131;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/30/2016.
 */
class LeetCode {
    public class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> res = new ArrayList<>();
            List<String> cur = new ArrayList<>();
            dfs(res, cur, s, 0);
            return res;
        }

        private void dfs(List<List<String>> res, List<String> cur, String s, int level) {
            if (level == s.length()) {
                res.add(new ArrayList<String>(cur));
                return;
            }
            for (int i=level+1; i<=s.length(); i++) {
                String split = s.substring(level, i);
                if (!test(split)) {
                    continue;
                }
                cur.add(split);
                dfs(res,cur,s,i);
                cur.remove(cur.size()-1);
            }
        }

        private boolean test(String split) {
            int left = 0, right = split.length()-1;
            while (left < right) {
                if (split.charAt(left) != split.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
