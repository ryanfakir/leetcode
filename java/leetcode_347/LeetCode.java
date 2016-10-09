package leetcode_347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by pyan on 10/8/2016.
 */
public class LeetCode {
    public class Solution {
        public List<Integer> topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> m = new HashMap<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(k, (x, y) -> m.get(x) - m.get(y));

            for (int ele: nums) {
                m.put(ele, m.getOrDefault(ele, 0) + 1);
            }
            for (int ele: m.keySet()) {
                pq.offer(ele);
                if (pq.size() > k) {
                    pq.poll();
                }
            }
            return new ArrayList<>(pq);
        }
    }
}
