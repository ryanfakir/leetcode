package leetcode_326;

/**
 * Created by pyan on 9/22/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isPowerOfThree(int n) {
            if (n <= 0) {
                return false;
            }
            boolean res = true;
            while(n > 1) {
                if (n%3 != 0) {
                    res = false;
                    break;
                }
                n = n/3;
            }
            return res;
        }
    }
}
