package leetcode_133;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by pyan on 11/8/2016.
 */
public class LeetCode {
    class UndirectedGraphNode {
      int label;
      List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<>(); }
  }
    public class Solution {
        public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
            if (node == null) return null;
            HashMap<UndirectedGraphNode, UndirectedGraphNode> m = new HashMap<>();
            UndirectedGraphNode res = new UndirectedGraphNode(node.label);
            m.put(node, res);
            dfs(m, node);
            return res;
        }

        private void dfs(HashMap<UndirectedGraphNode, UndirectedGraphNode> m, UndirectedGraphNode node) {
            if (node == null) {
                return;
            }
            for (UndirectedGraphNode el : node.neighbors) {
                if (!m.containsKey(el)) {
                    UndirectedGraphNode temp = new UndirectedGraphNode(el.label);
                    m.put(el, temp);
                    dfs(m, el);
                }
                m.get(node).neighbors.add(m.get(el));
            }
        }
    }
}
