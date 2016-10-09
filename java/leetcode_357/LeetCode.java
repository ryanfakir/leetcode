package leetcode_357;

/**
 * Created by pyan on 10/8/2016.
 */
class LeetCode {
    public class Solution {
        public int countNumbersWithUniqueDigits(int n) {
            int res = 0;
            n = Math.min(n, 10);
            if (n == 0) {
                return 1;
            }
            if (n == 1) {
                return 10;
            }
            int temp = 9;
            for (int i= 2 ; i<=n ; i++) {
                res += temp*(11-i);
                temp *= 11-i;
            }
            return res+10;
        }
    }
}
