package leetcode_171;

/**
 * Created by pyan on 9/18/2016.
 */
class LeetCode {
    public class Solution {
        public int titleToNumber(String s) {
            int value = 0;
            for (int i = 0; i < s.length();i++) {
                value += (s.charAt(s.length()-i-1)-'A' + 1)*(int)Math.pow(26, i);
            }
            return value;
        }
    }
}
