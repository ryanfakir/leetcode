package leetcode_264;

/**
 * Created by pyan on 10/29/2016.
 */
public class LeetCode {
    public class Solution {
        public int nthUglyNumber(int n) {
            int[] index = new int[3];
            int[] ugly = new int[n];
            int[] primes = new int[3];
            primes[0] = 2;
            primes[1] = 3;
            primes[2] = 5;
            ugly[0] = 1;
            for (int i=1; i<n; i++) {
                int min = Integer.MAX_VALUE;
                for (int j = 0; j<3; j++) {
                    min = Math.min(min, primes[j] * ugly[index[j]]);
                }
                ugly[i] = min;
                for (int j= 0; j<3; j++) {
                    if (primes[j]*ugly[index[j]] == min) {
                        index[j]++;
                    }
                }
            }
            return ugly[n-1];
        }
    }
}
