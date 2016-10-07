package leetcode_278;

/**
 * Created by pyan on 10/6/2016.
 */
public class LeetCode {
    public class VersionControl {
        public boolean isBadVersion(int n) {
            return true;
        }
    }

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int left = 1;
            int right = n;
            while (left+1 < right) {
                int mid = (right - left)/2 + left;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid;
                }
            }
            if (isBadVersion(left)) {
                return left;
            }
            return right;
        }
    }
}
