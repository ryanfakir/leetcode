package leetcode_121;

/**
 * Created by pyan on 9/24/2016.
 */
class LeetCode {
    public class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length < 2) {
                return 0;
            }
            int min = prices[0];
            int max = 0;
            for (int i = 1 ; i< prices.length; i++) {
                min = Math.min(prices[i], min);
                max = Math.max(prices[i]- min, max);
            }
            return max;
        }
    }
}
