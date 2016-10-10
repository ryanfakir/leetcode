package leetcode_378;

import java.util.PriorityQueue;

/**
 * Created by pyan on 10/9/2016.
 */
public class LeetCode {
    public class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int len = matrix.length;
            for (int i=0; i<len; i++) {
                for (int j=0; j<len; j++) {
                    pq.offer(matrix[i][j]);
                    if (pq.size() > len*len - k +1) {
                        pq.poll();
                    }
                }
            }
            return pq.poll();
        }
    }
}
