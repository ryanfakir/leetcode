package leetcode_400;

/**
 * Created by pyan on 10/2/2016.
 */
public class LeetCode {
    public class Solution {
        public int findNthDigit(int n) {
            long digit = 1;
            long base = 9;
            long start = 1;
            while (n-digit*base > 0) {
                n -=digit*base;
                ++digit;
                base *=10;
                start *= 10;
            }
            start += (n-1)/digit;
            String res = Long.toString(start);
            return res.charAt((n-1)%(int)digit)-'0';
        }
    }
}
