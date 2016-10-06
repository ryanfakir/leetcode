package leetcode_204;

/**
 * Created by pyan on 10/5/2016.
 */
class LeetCode {
    public class Solution {
        public int countPrimes(int n) {
            if (n == 0 || n == 1) {
                return 0;
            }
            boolean[] map = new boolean[n];
            map[0] = true;
            map[1] = true;
            int res = 0;
            for (int i = 2; i < n; i++) {
                if (!map[i]) {
                    for (int j = i*2; j<n; j = j+i) {
                        map[j] = true;
                    }
                }
            }
            for (int i= 0; i<n;i++ ) {
                if (!map[i]) {
                    res++;
                }
            }
            return res;
        }
    }
}
