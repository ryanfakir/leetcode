package leetcode_342;

/**
 * Created by pyan on 9/24/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isPowerOfFour(int num) {
            if (num < 1) {
                return false;
            }
            boolean res = false;
            int temp = num;
            while (temp%4 == 0) {
                temp >>>= 2;
            }
            return temp == 1;
        }
    }

}
