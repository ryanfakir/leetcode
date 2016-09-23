package leetcode_231;

/**
 * Created by pyan on 9/22/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n < 1) {
                return false;
            }
            boolean res = true;
            while (n > 1) {
                if (n % 2 != 0) {
                    res = false;
                    break;
                }
                n = n/2;
            }
            return res;
        }
    }
}
