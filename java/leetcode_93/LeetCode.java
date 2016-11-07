package leetcode_93;

import java.util.ArrayList;

/**
 * Created by pyan on 11/7/2016.
 */
public class LeetCode {
    public class Solution {
        public ArrayList<String> restoreIpAddresses(String s) {
            ArrayList<String> result = new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();

            if (s.length() < 4 || s.length() > 12)
                return result;

            helper(result, list, s, 0, 0);
            return result;
        }

        public void helper(ArrayList<String> result, ArrayList<String> list, String s, int start, int level) {
            if (level == 4) {
                if (start != s.length())
                    return;

                StringBuffer sb = new StringBuffer();
                for (String tmp : list) {
                    sb.append(tmp);
                    sb.append(".");
                }
                sb.deleteCharAt(sb.length() - 1);
                result.add(sb.toString());
                return;
            }

            for (int i = start; i < s.length() && i < start + 3; i++) {
                String tmp = s.substring(start, i + 1);
                if (isvalid(tmp)) {
                    list.add(tmp);
                    helper(result, list, s, i + 1, level + 1);
                    list.remove(list.size() - 1);
                } else {
                    break;
                }
            }
        }

        private boolean isvalid(String s) {
            if (s.length() == 1) {
                return true;
            } else if (s.charAt(0) == '0') {
                return false;
            }
            int digit = Integer.valueOf(s);
            return digit >= 0 && digit <= 255;
        }
    }
}
