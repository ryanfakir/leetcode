package leetcode_242;

/**
 * Created by pyan on 9/19/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isAnagram(String s, String t) {
            if (s == null || t == null) {
                return false;
            }
            int sLen = s.length();
            int tLen = t.length();
            if (sLen != tLen) {
                return false;
            }
            boolean res = true;
            int[] dict = new int[26];
            for (int i = 0; i < sLen; i++) {
                dict[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < tLen; i++) {
                if (dict[t.charAt(i) - 'a']-- == 0) {
                    res = false;
                    break;
                }
            }
            return res;
        }
    }
}
