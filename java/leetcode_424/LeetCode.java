package leetcode_424;

/**
 * Created by pyan on 10/20/2016.
 */
class LeetCode {
    public class Solution {
        public int characterReplacement(String s, int k) {
            int len = s.length();
            int[] dict = new int[26];
            int max = 0;
            int res = 0;
            int start = 0;
            for (int i=0; i<len; i++) {
                max = Math.max(max, ++dict[s.charAt(i)-'A']);
                while (i-start - max + 1 > k) {
                    dict[s.charAt(start)-'A']--;
                    start++;
                }
                res = Math.max(res, i-start +1);
            }
            return res;
        }
    }
}
