package leetcode_310;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by pyan on 11/5/2016.
 */
public class LeetCode {
    public class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Integer> leaves = new ArrayList<>();
            if (n == 0) {
                return leaves;
            }
            if (n ==1) {
                leaves.add(0);
                return leaves;
            }
            Map<Integer, List<Integer>> m = new HashMap<>();
            for (int i=0; i<n; i++) {
                m.putIfAbsent(i, new ArrayList<>());
            }
            for (int i =0; i<edges.length; i++) {
                List<Integer> arrO = m.getOrDefault(edges[i][0], new ArrayList<>());
                List<Integer> arrT = m.getOrDefault(edges[i][1], new ArrayList<>());
                arrO.add(edges[i][1]);
                arrT.add(edges[i][0]);
                m.put(edges[i][0], arrO);
                m.put(edges[i][1], arrT);
            }
            for (Map.Entry<Integer, List<Integer>> entry: m.entrySet()) {
                if (entry.getValue().size() == 1) {
                    leaves.add(entry.getKey());
                }
            }
            while (n >2) {
                n -= leaves.size();
                List<Integer> newLeaves = new ArrayList<>();
                for (int i : leaves) {
                    int parent = m.get(i).get(0);
                    m.get(parent).remove(new Integer(i));
                    if (m.get(parent).size() == 1) {
                        newLeaves.add(parent);
                    }
                }
                leaves = newLeaves;
            }
            return leaves;
        }
    }
}
