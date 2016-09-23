package leetcode_202;

/**
 * Created by pyan on 9/22/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isHappy(int n) {
            boolean res = false;
            if (n < 10) {
                if (n == 1 || n == 7) {
                    res =  true;
                } else {
                    res = false;
                }
                return res;
            }
            int sum = 0;
            while (n > 0) {
                int remain = n%10;
                sum += remain * remain;
                n = n/10;
            }
            return isHappy(sum);
        }
    }
}
