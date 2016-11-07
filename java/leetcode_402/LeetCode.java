package leetcode_402;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 11/7/2016.
 */
public class LeetCode {
    public class Solution {
        public String removeKdigits(String nums, int k) {
            char[] arr = nums.toCharArray();
            int n = nums.length();
            List<Integer> res = new ArrayList<>();
            for (char el : arr) {
                int temp = el - '0';
                while (k>0 && res.size() >0 && res.get(res.size() -1) > temp) {
                    res.remove(res.size() -1);
                    k--;
                }
                res.add(temp);
            }
            String output = "";
            for (int el : res) {
                output += el;
            }
            StringBuilder sb = new StringBuilder(output);
            if (k <= sb.length()) {
                sb.delete(sb.length()-k, sb.length());
            } else {
                return "0";
            }
            while (sb.length() > 1 && sb.charAt(0)=='0') {
                sb.delete(0,1);
            }
            if (sb.length() == 0) {
                return "0";
            }
            return sb.toString();
        }
    }
}
