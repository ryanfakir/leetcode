package leetcode_331;

/**
 * Created by pyan on 10/23/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isValidSerialization(String preorder) {
            String[] dict = preorder.split(",");
            int diff = 1;
            for (String el: dict) {
                if (--diff<0) {
                    return false;
                }
                if (!el.equals("#")) {
                    diff +=2;
                }
            }
            return diff == 0;
        }
    }
}
