package leetcode_383;

/**
 * Created by pyan on 9/17/2016.
 */
class LeetCode {
    public class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            int[] dict = new int[26];
            for (int i = 0; i < magazine.length(); i++) {
                dict[magazine.charAt(i) - 'a']++;
            }
            // matching phase
            boolean res = true;
            for (int i = 0; i < ransomNote.length(); i++) {
                if (--dict[ransomNote.charAt(i) - 'a'] < 0) {
                    res = false;
                    break;
                }
            }
            return res;
        }
    }
}
