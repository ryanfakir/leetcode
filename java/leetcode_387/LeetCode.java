package leetcode_387;

/**
 * Created by pyan on 9/20/2016.
 */
class LeetCode {
    public class Solution {
        public int firstUniqChar(String s) {
            if (s == null) {
                return -1;
            }
            int[] dict = new int[26];
            for (int i = 0; i < s.length(); i++) {
                dict[s.charAt(i) - 'a']++;
            }
            int res = -1;
            for (int i =0; i< s.length();i++) {
                if (dict[s.charAt(i) - 'a'] == 1) {
                    res = i;
                    break;
                }
            }
            return res;
        }
    }
}
