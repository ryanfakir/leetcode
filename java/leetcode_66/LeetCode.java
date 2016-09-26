package leetcode_66;

/**
 * Created by pyan on 9/25/2016.
 */
public class LeetCode {

    public class Solution {
        public int[] plusOne(int[] digits) {
            if (digits == null) {
                return digits;
            }
            int length = digits.length;
            int i = length -1;
            int carry = 1;
            while (i > -1) {
                if (carry != 0) {
                    digits[i] += 1;
                    carry = 0;
                }
                if (digits[i] > 9) {
                    digits[i] = 0;
                    carry = 1;
                }
                i--;
            }
            if (carry == 1) {
                int[] res = new int[length+1];
                for (int k = 1; k<length+1 ; k++) {
                    res[k] = digits[k-1];
                }
                res[0] = 1;
                digits = res;
            }
            return digits;
        }
    }
}
