package leetcode_399;

import java.util.*;

/**
 * Created by pyan on 10/15/2016.
 */
public class LeetCode {
    public class Solution {
        public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
            HashMap<String, HashMap<String, Double>> graph = constructGraph(equations, values);
            return bfs(graph, queries);
        }

        private double[] bfs(HashMap<String, HashMap<String, Double>> graph, String[][] queries) {
            double[] res = new double[queries.length];
            for (int i=0; i<queries.length; i++) {
                if (!(graph.containsKey(queries[i][0]) && graph.containsKey(queries[i][1]))) {
                    res[i] = -1d;
                    continue;
                }
                Queue<String> q = new LinkedList<>();
                Queue<Double> value = new LinkedList<>();
                q.offer(queries[i][0]);
                value.offer(1d);
                Set<String> visited = new HashSet<>();
                boolean find = false;
                while (!q.isEmpty() && !find) {
                    String vertex = q.poll();
                    Double prev = value.poll();
                    for (Map.Entry<String, Double> el : graph.get(vertex).entrySet()) {
                        if (!visited.contains(el.getKey())) {
                            if (el.getKey().equals(queries[i][1])) {
                                res[i] = el.getValue()*prev;
                                find = true;
                                break;
                            } else {
                                q.offer(el.getKey());
                                value.offer(el.getValue()*prev);
                                visited.add(el.getKey());
                            }
                        }
                    }
                }
                if (res[i] == 0) {
                    res[i] = -1d;
                }
            }
            return res;
        }

        private HashMap<String, HashMap<String, Double>> constructGraph(String[][] equations, double[] values) {
            HashMap<String, HashMap<String, Double>> res = new HashMap<String, HashMap<String, Double>>();
            HashMap<String, Double> subMap;
            for (int i=0; i<equations.length; i++) {
                if (res.containsKey(equations[i][0])) {
                    subMap = res.get(equations[i][0]);
                } else {
                    subMap = new HashMap<String, Double>();
                }
                subMap.put(equations[i][1], values[i]);
                res.put(equations[i][0], subMap);
            }
            for (int i=0; i<equations.length; i++) {
                if (res.containsKey(equations[i][1])) {
                    subMap = res.get(equations[i][1]);
                } else {
                    subMap = new HashMap<String, Double>();
                }
                subMap.put(equations[i][0], 1/values[i]);
                res.put(equations[i][1], subMap);
            }
            for (int i=0; i<equations.length; i++) {
                if (res.containsKey(equations[i][1])) {
                    subMap = res.get(equations[i][1]);
                } else {
                    subMap = new HashMap<String, Double>();
                }
                subMap.put(equations[i][1], 1d);
                res.put(equations[i][1], subMap);
            }
            for (int i=0; i<equations.length; i++) {
                if (res.containsKey(equations[i][0])) {
                    subMap = res.get(equations[i][0]);
                } else {
                    subMap = new HashMap<String, Double>();
                }
                subMap.put(equations[i][0], 1d);
                res.put(equations[i][0], subMap);
            }
            return res;
        }
    }
}
