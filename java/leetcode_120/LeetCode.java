package leetcode_120;

import java.util.List;

/**
 * Created by pyan on 10/26/2016.
 */
public class LeetCode {
    public class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            if (triangle == null || triangle.size() == 0 || triangle.get(0).size() == 0) {
                return 0;
            }
            int row = triangle.size();
            int[] curDP = new int[row];
            curDP[0] = triangle.get(0).get(0);
            for (int i = 1; i< row; i++) {
                int[] nextDP = new int[row];
                for (int j=0; j <= i; j++) {
                    if (j == 0) {
                        nextDP[0] = curDP[0] + triangle.get(i).get(0);
                    } else if (j == i) {
                        nextDP[j] = curDP[j-1] + triangle.get(i).get(j);
                    } else {
                        nextDP[j] = Math.min(curDP[j-1], curDP[j]) + triangle.get(i).get(j);
                    }
                }
                curDP = nextDP;

            }
            int res = Integer.MAX_VALUE;
            for (int ele : curDP) {
                res = Math.min(res, ele);
            }
            return res;
        }
    }
}
