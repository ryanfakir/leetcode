package leetcode_386;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 10/16/2016.
 */
class LeetCode {
    public class Solution {
        private List<Integer> result;
        private int n;

        public List<Integer> lexicalOrder(int n) {
            this.result = new ArrayList<>();
            this.n = n;
            solve(1);
            return result;
        }

        private void solve(int m) {
            result.add(m);
            if (m * 10 <= n) solve(m * 10);
            if (m < n && m % 10 < 9) solve(m + 1);
        }
    }
}
