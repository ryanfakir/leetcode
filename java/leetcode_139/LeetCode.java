package leetcode_139;

import java.util.Set;

/**
 * Created by pyan on 11/5/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean wordBreak(String s, Set<String> wordDict) {
            if (s == null || s.length() == 0 ) {
                return false;
            }
            boolean[] res = new boolean[s.length()+1];
            res[0] = true;
            for (int i= 1; i<s.length()+1; i++) {
                for (int j = 0; j<i; j++) {
                    if (res[j] && wordDict.contains(s.substring(j, i))) {
                        res[i] = true;
                        break;
                    }
                }
            }
            return res[s.length()];
        }
    }
}
