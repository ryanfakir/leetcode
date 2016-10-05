package leetcode_397;

/**
 * Created by pyan on 10/4/2016.
 */
public class LeetCode {
    public class Solution {
        public int integerReplacement(int n) {
            if (n == Integer.MAX_VALUE)
                return 32;
            int count = 0;
            while (n != 1) {
                if ((n & 1) == 0) {
                    n = n >> 1;
                    count++;
                } else {
                    if (n == 3)
                        n = 2;
                    else {
                        if (countTrailZero(n - 1) > countTrailZero(n + 1)) {
                            n = n - 1;
                        } else {
                            n = n + 1;
                        }
                    }
                    count++;
                }
            }
            return count;

        }

        private int countTrailZero(int n) {
            int c = 0;
            while ((n & 1) == 0) {
                n = n >> 1;
                c++;
            }
            return c;
        }
    }
}
