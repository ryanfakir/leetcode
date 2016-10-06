package leetcode_28;

/**
 * Created by pyan on 10/5/2016.
 */
class LeetCode {
    public class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) {
                return 0;
            }
            int start = 0;
            int hLength = haystack.length();
            int nLength = needle.length();
            while (start < hLength-nLength +1) {
                for (int i = 0; i<nLength; i++) {
                    if (haystack.charAt(start+ i) != needle.charAt(i)) {
                        break;
                    }
                    if (i == nLength-1 && haystack.charAt(start + i) == needle.charAt(i)) {
                        return start;
                    }
                }
                start++;
            }
            return -1;
        }
    }
}
