package leetcode_343;

/**
 * Created by pyan on 10/9/2016.
 */
public class LeetCode {
    public class Solution {
        public int integerBreak(int n) {
            if (n == 2 || n == 3 ) {
                return n-1;
            }
            int res = 1;
            while (n != 0) {
                if (n%3 == 0) {
                    n -= 3;
                    res *= 3;
                } else if (n%3 == 1) {
                    n -= 4;
                    res *= 4;
                } else {
                    n-=2;
                    res*=2;
                }
            }
            return res;
        }
    }
}
