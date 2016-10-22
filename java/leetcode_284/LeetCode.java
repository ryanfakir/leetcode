package leetcode_284;

import java.util.Iterator;

/**
 * Created by pyan on 10/21/2016.
 */
public class LeetCode {
    class PeekingIterator implements Iterator<Integer> {

        Integer cur;
        Iterator<Integer> iterator;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            this.cur = iterator.hasNext()? iterator.next() :null;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return this.cur;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            int res = cur;
            this.cur = iterator.hasNext()? iterator.next() :null;
            return res;
        }

        @Override
        public boolean hasNext() {
            return this.cur != null;
        }
    }
}
