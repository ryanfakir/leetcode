package leetcode_313;

/**
 * Created by pyan on 10/17/2016.
 */
public class LeetCode {
    public class Solution {
        public int nthSuperUglyNumber(int n, int[] primes) {
            int len = primes.length;
            int[] location = new int[len];
            int[] res = new int[n];
            res[0] = 1;
            for (int i=1; i<n; i++) {
                res[i] = Integer.MAX_VALUE;
                for (int j = 0; j<len; j++) {
                    res[i] = Math.min(res[i], res[location[j]]*primes[j]);
                }
                for (int j = 0; j<len; j++) {
                    while (res[i] == res[location[j]]*primes[j]) {
                        location[j]++;
                    }
                }
            }
            return res[n-1];
        }
    }
}
