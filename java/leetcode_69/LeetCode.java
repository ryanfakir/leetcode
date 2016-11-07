package leetcode_69;

/**
 * Created by pyan on 11/6/2016.
 */
public class LeetCode {
    public class Solution {
        public int mySqrt(int x) {
            long left = 0, right = x;
            while (left +1 < right ){
                long mid = (right-left)/2 + left;
                if (mid * mid == x) {
                    return (int)mid;
                } else if (mid * mid > x) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            if (left * left == x || right * right == x) {
                if (left*left == x) {
                    return (int)left;
                } else {
                    return (int)right;
                }
            }
            if (right * right <= x) {
                return (int)right;
            }
            return (int)left;
        }
    }
}
