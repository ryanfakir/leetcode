package leetcode_223;

/**
 * Created by pyan on 10/1/2016.
 */
class LeetCode {
    public class Solution {
        public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
            int x = 0;
            int y = 0;
            int sum = (C-A) * (D-B) + (G-E)*(H-F);
            if (G <= A || C<= E  || B >= H || D <= F) {
                return sum;
            }
            if (A < E) {
                x = C > G ? G - E: C-E;
            } else {
                x = C > G ? G - A: C-A;
            }
            if (B < F) {
                y = D > H ? H- F : D - F;
            } else {
                y = D > H ? H- B : D - B;
            }
            return sum - x*y;
        }
    }
}
