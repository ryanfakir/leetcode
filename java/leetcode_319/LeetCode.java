package leetcode_319;

/**
 * Created by pyan on 10/9/2016.
 */
public class LeetCode {
    public class Solution {
        public int bulbSwitch(int n) {
            int res = 1;
            while (res *res <= n) {
                res++;
            }
            return res-1;
        }
    }
}
