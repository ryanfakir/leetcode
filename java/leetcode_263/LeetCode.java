package leetcode_263;

/**
 * Created by pyan on 9/23/2016.
 */
class LeetCode {
    public class Solution {
        public boolean isUgly(int num) {
            if (num <1) {
                return false;
            }
            int temp = num;
            boolean res = true;
            while (temp != 0) {
                if (temp % 2 == 0) {
                    temp = temp/2;
                } else if (temp % 3 == 0) {
                    temp = temp/3;
                } else if (temp% 5 == 0) {
                    temp = temp/5;
                } else if (temp == 1){
                    break;
                } else {
                    res = false;
                    break;
                }
            }
            return res;
        }
    }
}
