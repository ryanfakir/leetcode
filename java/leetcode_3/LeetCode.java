package leetcode_3;

/**
 * Created by pyan on 11/10/2016.
 */
public class LeetCode {
    public class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }
            int[] dict = new int[256];
            int right = 0, left = 0;
            int res = 1;
            while (right < s.length()) {
                while (right < s.length() && dict[s.charAt(right)] == 0) {
                    dict[s.charAt(right)] = 1;
                    right++;
                }
                res = Math.max(res, right-left);
                dict[s.charAt(left)] = 0;
                left++;
            }
            return res;
        }
    }
}
