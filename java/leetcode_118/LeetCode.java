package leetcode_118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pyan on 9/26/2016.
 */
class LeetCode {
    public class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> level = new ArrayList<>();
                int start = 0;
                while (start < i+1) {
                    if (start == 0) {
                        level.add(1);
                    } else if (start == i) {
                        level.add(1);
                    } else {
                        List<Integer> prev = res.get(i-1);
                        level.add(prev.get(start-1)+ prev.get(start));
                    }
                    start++;
                }
                res.add(level);
            }
            return res;
        }
    }
}
