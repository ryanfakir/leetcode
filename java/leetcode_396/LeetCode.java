package leetcode_396;

/**
 * Created by pyan on 10/4/2016.
 */
class LeetCode {
    public class Solution {
        public int maxRotateFunction(int[] A) {
            int sumOne = 0;
            int n = A.length;
            int fResult = 0;
            for(int i=0; i<n; i++) {
                fResult +=A[i]*i;
                sumOne += A[i];
            }
            int res = fResult;
            for (int i = 1; i<n; i++) {
                fResult += sumOne-n*A[n-i];
                res = Math.max(res, fResult);
            }
            return res;
        }
    }
}
