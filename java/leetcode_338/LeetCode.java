package leetcode_338;

/**
 * Created by pyan on 10/7/2016.
 */
public class LeetCode {
    public class Solution {
        public int[] countBits(int num) {
            int[] res = new int[num+1];
            int level = 0;
            res[0] = 0;
            for (int i=1; i<num+1; i++) {
                if (i/Math.pow(2, level+1) > 1) {
                    level++;
                }
                res[i] = res[(int)(i%Math.pow(2, level))] + 1;
            }
            return res;
        }
    }
}
