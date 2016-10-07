package leetcode_7;

/**
 * Created by pyan on 10/6/2016.
 */
public class LeetCode {
    public class Solution {
        public int reverse(int x) {
            int temp = x;
            long res = 0;
            boolean positive = false;
            if (temp > 0) {
                positive = true;
            }
            while (temp != 0) {
                temp = Math.abs(temp);
                int digit = temp%10;
                temp /=10;
                res = res*10 + digit;
            }
            if (res > Integer.MAX_VALUE || res< Integer.MIN_VALUE) {
                return 0;
            }
            if (positive) {
                return (int)res;
            } else {
                return (int)-res;
            }
        }
    }
}
