package leetcode_398;

import java.util.Random;

/**
 * Created by pyan on 10/19/2016.
 */
public class LeetCode {
    public class Solution {
        int[] arr;

        public Solution(int[] nums) {
            this.arr = nums;
        }

        public int pick(int target) {
            Random r = new Random();
            int size = 0;
            int res = 0;
            for (int i = 0; i< this.arr.length; i++) {
                if (this.arr[i] == target) {
                    size++;
                    if (r.nextInt(size) == 0) {
                        res =  i;
                    }
                }
            }
            return res;
        }
    }
}
