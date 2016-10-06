package leetcode_303;

/**
 * Created by pyan on 10/5/2016.
 */
class LeetCode {
    public class NumArray {

        int[] sum;
        public NumArray(int[] nums) {
            int length = nums.length;
            sum = new int[length+1];
            for (int i=1; i<sum.length; i++) {
                sum[i] = sum[i-1] + nums[i-1];
            }
        }

        public int sumRange(int i, int j) {
            return sum[j+1] - sum[i];
        }
    }
}
