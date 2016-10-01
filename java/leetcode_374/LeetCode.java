package leetcode_374;

/**
 * Created by pyan on 9/30/2016.
 */
public class LeetCode {
    public class Solution {
        public int guessNumber(int n) {
            int l = 0;
            int r = n;
            while (l<r) {
                int mid = l + (r-l)/2;
                System.out.println(mid);
                if (guess(mid) == -1) {
                    r = mid-1;
                } else if (guess(mid) == 1) {
                    l = mid+1;
                } else {
                    return mid;
                }
            }
            return l;
        }
    }

    private int guess(int mid) {
        return 0;
    }
}
