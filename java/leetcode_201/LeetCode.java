package leetcode_201;

/**
 * Created by pyan on 10/24/2016.
 */
class LeetCode {
    public class Solution {
        public int rangeBitwiseAnd(int m, int n) {
            if (n == m) {
                return n;
            }
            return rangeBitwiseAnd(m >>1, n >>1) << 1;
        }
    }
}
