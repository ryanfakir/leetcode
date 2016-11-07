package leetcode_306;

/**
 * Created by pyan on 11/6/2016.
 */
public class LeetCode {
    public class Solution {
        public boolean isAdditiveNumber(String num) {
            if (num == null || num.length() <3) {
                return false;
            }
            boolean res = false;
            for (int i=0; i<num.length(); i++) {
                for (int j=i+1; j<num.length(); j++) {
                    res = helper(num, 0, i, j);
                    if (res) {
                        return res;
                    }
                }
            }
            return res;
        }

        private boolean helper(String nums, int start, int mid, int end) {
            String first = nums.substring(start, mid+1);
            String sec = nums.substring(mid+1, end+1);
            if (!(isValid(first) && isValid(sec))) {
                return false;
            }
            int windowSize = Math.max(first.length(), sec.length());
            if (windowSize > nums.length()/2) {
                return false;
            }
            String third = Long.parseLong(first) + Long.parseLong(sec) + "";
            int len = third.length();
            if (len + end + 1 > nums.length()) {
                return false;
            }
            if (!nums.substring(end+1, end+len +1).equals(third)) {
                return false;
            }
            if (end+len == nums.length() -1) {
                return true;
            }
            return helper(nums, mid+1, end, end+len);
        }

        private boolean isValid(String temp) {
            return !((temp.charAt(0) == '0') && temp.length() > 1);
        }
    }
}
