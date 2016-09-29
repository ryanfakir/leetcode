package leetcode_9;

/**
 * Created by pyan on 9/28/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isPalindrome(int x) {
            if (x<0) {
                return false;
            }
            return x == reverse(x);
        }

        private int reverse(int x) {
            int res = 0;
            while (x > 0) {
                res = x%10 + res*10;
                x /=10;
            }
            return res;
        }
    }
}
