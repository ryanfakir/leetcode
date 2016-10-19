package leetcode_341;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * Created by pyan on 10/18/2016.
 */
public class LeetCode {
    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    public class NestedIterator implements Iterator<Integer> {

        Stack<NestedInteger> stack = new Stack<NestedInteger>();

        public NestedIterator(List<NestedInteger> nestedList) {
            if (nestedList == null)
                return;

            for (int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while (!stack.isEmpty()) {
                NestedInteger top = stack.peek();
                if (top.isInteger()) {
                    return true;
                } else {
                    stack.pop();
                    for (int i = top.getList().size() - 1; i >= 0; i--) {
                        stack.push(top.getList().get(i));
                    }
                }
            }

            return false;
        }
    }
}
