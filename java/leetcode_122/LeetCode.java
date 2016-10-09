package leetcode_122;

/**
 * Created by pyan on 10/8/2016.
 */
public class LeetCode {
    public class Solution {
        public int maxProfit(int[] prices) {
            int res = 0;
            for (int i = 0; i<prices.length-1; i++) {
                if (prices[i+1] - prices[i] >= 0) {
                    res += prices[i+1] - prices[i];
                }
            }
            return res;
        }
    }
}
