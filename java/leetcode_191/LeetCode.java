package leetcode_191;

/**
 * Created by pyan on 9/23/2016.
 */
public class LeetCode {
    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {
            int res = 0;
            while (n != 0) {
                res += n&1;
                n = n>>> 1;
            }
            return res;
        }
    }
}
