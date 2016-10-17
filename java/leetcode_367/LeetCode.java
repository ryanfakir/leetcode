package leetcode_367;

/**
 * Created by pyan on 10/16/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isPerfectSquare(int num) {
            if (num < 0) {
                return false;
            }
            if (num == 0) {
                return true;
            }
            int left = 0;
            int right = num;
            while (left + 1 < right) {
                long mid = (right - left)/2 + left;
                if (mid * mid > num) {
                    right = (int)mid;
                } else if (mid * mid < num){
                    left = (int)mid;
                } else {
                    return true;
                }
            }
            if (left * left == num || right * right == num) {
                return true;
            }
            return false;
        }
    }
}
