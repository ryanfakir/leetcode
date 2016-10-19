package leetcode_75;

/**
 * Created by pyan on 10/18/2016.
 */
public class LeetCode {
    public class Solution_tworound {
        public void sortColors(int[] nums) {
            int len = nums.length;
            int[] dict = new int[3];
            for (int i=0; i<len; i++) {
                dict[nums[i]]++;
            }
            int i=0;
            for (int j = 0; j<3; j++) {
                while (dict[j] > 0) {
                    nums[i++] = j;
                    dict[j]--;
                }
            }

        }
    }

    public class Solution_oneround {
        public void sortColors(int[] nums) {
            int red = 0, blue = nums.length -1;
            int i = 0;
            while (i <= blue) {
                if (nums[i] == 0) {
                    swap(nums, i, red);
                    red++;
                    i++;
                } else if (nums[i] == 2) {
                    swap(nums, i, blue);
                    blue--;
                } else {
                    i++;
                }
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
