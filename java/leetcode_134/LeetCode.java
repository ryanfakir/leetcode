package leetcode_134;

/**
 * Created by pyan on 11/4/2016.
 */
public class LeetCode {
    public class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            int res = 0;
            int[] total  = new int[gas.length];
            for (int i= 0; i<gas.length; i++) {
                total[i] = gas[i] - cost[i];
            }
            int sum = 0;
            int gap = 0;
            for (int i= 0; i<gas.length; i++) {
                sum += total[i];
                if (sum < 0) {
                    gap += sum;
                    sum =0;
                    res = i+1;
                }
            }
            return sum + gap >=0 ? res: -1;
        }
    }
}
