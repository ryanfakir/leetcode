package leetcode_14;

/**
 * Created by pyan on 10/3/2016.
 */
class LeetCode {
    public class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) {
                return "";
            }
            String res = "";
            int index = 0;
            char prev = 0;
            int min = Integer.MAX_VALUE;
            while (index <= min) {
                for (int i = 0; i<strs.length; i++) {
                    min = Math.min(strs[i].length()-1, min);
                    if (index > min) {
                        return res;
                    }
                    System.out.println(index);
                    if (prev == 0) {
                        prev = strs[i].charAt(index);
                    } else {
                        if (prev != strs[i].charAt(index)) {
                            return res;
                        }
                    }
                }
                res += prev;
                prev = 0;
                index++;
            }
            return res;
        }
    }
}
