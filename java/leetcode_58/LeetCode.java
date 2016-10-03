package leetcode_58;

/**
 * Created by pyan on 10/3/2016.
 */
public class LeetCode {
    public class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null) {
                return 0;
            }
            String[] res = s.split(" ");
            if (res.length < 1) {
                return 0;
            }
            return res[res.length-1].length();
        }
    }
}
