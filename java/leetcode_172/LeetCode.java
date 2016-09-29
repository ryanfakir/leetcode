package leetcode_172;

/**
 * Created by pyan on 9/28/2016.
 */
class LeetCode {
    public class Solution {
        public int trailingZeroes(int n) {
            int sum = 0;
            while (n>0) {
                sum += n/5;
                n /= 5;
            }
            return sum;
        }
    }
}
